# Outline
This is an alternative to the java.awt.geom.Area class, focusing on performance.

# Overview
As of this writing (Feb 2022) this project accomplishes 3 things:
* It improves performance when combining (adding) several shapes (see [profile results](https://github.com/mickleness/outline/blob/master/Adding%20Shapes%20For%20Outline%20Output.log)).
* It improves performance when clipping shapes to a rectangle (see [profile results](https://github.com/mickleness/outline/blob/master/Clipping%20Shapes%20Output.log)).
* It offers an alternative to the Area class (see [the RectangleMask2D](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/mask/RectangleMask2D.java)).

# Coming Soon (ish)
So far most of my changes still rely on the `Area` class - we're just using it more carefully. Eventually I also want to fork the Area class and provide a new replacement with additional internal optimizations.

# Status
This project is still under development. I'll update everything (including this doc) when I have an official v1.0 release. This is an unpaid free-time project, so there is no release schedule planned.

# Architecture
This project introduces the [`Outline`](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/outline/Outline.java) class as a replacement for the `Area` class. Internally an Outline is a simple wrapper object that contains three things:
* A base shape
* A series of operations (add/subtract/clip/xor) to perform on the base shape
* An [`OutlineEngine`](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/outline/OutlineEngine.java) responsible for executing operations as needed

The queued operations are only performed when it becomes necessary. That is: you may add 100 shapes, but no geometric analysis happens until you actually ask to render the `Outline` object. Sometimes looking at several shapes in bulk can help us spot performance optimizations.

There are current three recommended `OutlineEngines`:
* The [`AreaOutlineEngine`](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/outline/AreaOutlineEngine.java) simply uses `Area` objects to execute all operations. There may be a few very small/subtle optimizations, but performance-wise this should be mostly identical to using an `Area` object directly.
* The [`OptimizedOutlineEngine`](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/outline/OptimizedOutlineEngine.java) uses simple optimizations to increase performance. It always delegates to another underlying engine (typically the `AreaOutlineEngine`) when it can't optimize away an operation.
* The [`ScaledMaskOutlineEngine`](https://github.com/mickleness/outline/blob/master/src/com/pump/awt/geom/outline/ScaledMaskOutlineEngine.java) uses a `RectangleMask2D` (see below) instead of an `Area`.

# Other Notable Classes

## `RectangleMask2D`
This is a `java.awt.Shape` this is a mask composed of `java.awt.geom.Rectangle2Ds`. (And it has a related cousin: the `RectangleMask` is composed for `java.awt.Rectangles`)

You can think of this as a "pixelated shape". You can designate a resolution and add an arbitrary `java.awt.Shape`, and it will convert that shape to a series of small rectangles. If you set the resolution to 2 (so each "pixel" can be divided into four (2x2) rectangles), then your resulting shape still appears antialiased on a 100% monitor. If you set the resolution to 3 or 4 then the results look antialiased on a high resolution monitor, too.

Performance-wise this is hard to compare to the `AreaEngine`. In some tests it was faster, and in others it was slower.

Most of the code in this project is intended to supplement the existing `Area` class, but this is class's selling point is it's an alternative. In rare cases the `Area` class can throw `OutOfMemoryErrors`. Or - if you avoid the errors - sometimes an Area can take seconds or minutes to finish a geometric operation. If you're OK with the trade-off of losing your Bézier curvature: this might be a good fit for you.

You can write your project using `Outline` objects, and then switch between the `ScaledMaskOutlineEngine` and the `AreaOutlineEngine` if you want to compare the two.

## `RectangularClipper`
This class clips an arbitrary shape to a `Rectangle2D`.

## `MonotonicPathIterator`
This `PathIterator` breaks up another iterator into monotonic segments.

## `CompoundShape`
This is a `java.awt.Shape` composed of several member shapes. This offers some performance benefits at no overhead to the caller.

For example: suppose you want to create a glyph for an equals sign. A `CompoundShape` will store both rectangles. As long as no member shapes overlap you can add indefinitely many shapes to a `CompoundShape` without triggering any complex geometric analysis. If you try to add a diagonal slash to the equals sign, though, then a `CompoundShape` will use an `OutlineEngine` (usually an `AreaOutlineEngine`) to flatten all the members into one layer.

The `OptimizedOutlineEngine` uses a `CompoundShape` to achieve some of its performance benefits. In general I don't recommend instantiating a `CompoundShape` directly: you're probably better off just using an `Outline` with the default `OptimizedOutlineEngine`.
