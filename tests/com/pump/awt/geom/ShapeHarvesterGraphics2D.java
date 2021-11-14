package com.pump.awt.geom;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.List;
import java.util.Map;

/**
 * This collects shapes as they are rendered to a delegate Graphics2D. This is for
 * harvesting shapes from clip art for testing. Many methods throw an
 * UnsupportedOperationException.
 */
class ShapeHarvesterGraphics2D extends Graphics2D {

    Graphics2D delegate;
    List<Shape> shapes;

    public ShapeHarvesterGraphics2D(Graphics2D delegate, List<Shape> shapes) {
        this.delegate = delegate;
        this.shapes = shapes;
    }

    @Override
    public void draw(Shape s) {
        delegate.draw(s);
        shapes.add(getTransform().createTransformedShape(getStroke().createStrokedShape(s)));
    }

    @Override
    public void fill(Shape s) {
        delegate.fill(s);
        shapes.add(getTransform().createTransformedShape(s));
    }

    @Override
    public void draw3DRect(int x, int y, int width, int height, boolean raised) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fill3DRect(int x, int y, int width, int height, boolean raised) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawString(String str, int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawString(String str, float x, float y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, float x, float y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawGlyphVector(GlyphVector g, float x, float y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        return delegate.hit(rect, s, onStroke);
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        return delegate.getDeviceConfiguration();
    }

    @Override
    public void setComposite(Composite comp) {
        delegate.setComposite(comp);
    }

    @Override
    public void setPaint(Paint paint) {
        delegate.setPaint(paint);
    }

    @Override
    public void setStroke(Stroke s) {
        delegate.setStroke(s);
    }

    @Override
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
        delegate.setRenderingHint(hintKey, hintValue);
    }

    @Override
    public Object getRenderingHint(RenderingHints.Key hintKey) {
        return delegate.getRenderingHint(hintKey);
    }

    @Override
    public void setRenderingHints(Map<?, ?> hints) {
        delegate.setRenderingHints(hints);
    }

    @Override
    public void addRenderingHints(Map<?, ?> hints) {
        delegate.addRenderingHints(hints);
    }

    @Override
    public RenderingHints getRenderingHints() {
        return delegate.getRenderingHints();
    }

    @Override
    public void translate(int x, int y) {
        delegate.translate(x, y);
    }

    @Override
    public void translate(double tx, double ty) {
        delegate.translate(tx, ty);
    }

    @Override
    public void rotate(double theta) {
        delegate.rotate(theta);
    }

    @Override
    public void rotate(double theta, double x, double y) {
        delegate.rotate(theta, x, y);
    }

    @Override
    public void scale(double sx, double sy) {
        delegate.scale(sx, sy);
    }

    @Override
    public void shear(double shx, double shy) {
        delegate.shear(shx, shy);
    }

    @Override
    public void transform(AffineTransform Tx) {
        delegate.transform(Tx);
    }

    @Override
    public void setTransform(AffineTransform Tx) {
        delegate.setTransform(Tx);
    }

    @Override
    public AffineTransform getTransform() {
        return delegate.getTransform();
    }

    @Override
    public Paint getPaint() {
        return delegate.getPaint();
    }

    @Override
    public Composite getComposite() {
        return delegate.getComposite();
    }

    @Override
    public void setBackground(Color color) {
        delegate.setBackground(color);
    }

    @Override
    public Color getBackground() {
        return delegate.getBackground();
    }

    @Override
    public Stroke getStroke() {
        return delegate.getStroke();
    }

    @Override
    public void clip(Shape s) {
        delegate.clip(s);
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return delegate.getFontRenderContext();
    }

    @Override
    public Graphics create() {
        return new ShapeHarvesterGraphics2D( (Graphics2D) delegate.create(), shapes);
    }

    @Override
    public Graphics create(int x, int y, int width, int height) {
        return new ShapeHarvesterGraphics2D( (Graphics2D) delegate.create(x, y, width, height), shapes);
    }

    @Override
    public Color getColor() {
        return delegate.getColor();
    }

    @Override
    public void setColor(Color c) {
        delegate.setColor(c);
    }

    @Override
    public void setPaintMode() {
        delegate.setPaintMode();
    }

    @Override
    public void setXORMode(Color c1) {
        delegate.setXORMode(c1);
    }

    @Override
    public Font getFont() {
        return delegate.getFont();
    }

    @Override
    public void setFont(Font font) {
        delegate.setFont(font);
    }

    @Override
    public FontMetrics getFontMetrics() {
        return delegate.getFontMetrics();
    }

    @Override
    public FontMetrics getFontMetrics(Font f) {
        return delegate.getFontMetrics(f);
    }

    @Override
    public Rectangle getClipBounds() {
        return delegate.getClipBounds();
    }

    @Override
    public void clipRect(int x, int y, int width, int height) {
        delegate.clipRect(x, y, width, height);
    }

    @Override
    public void setClip(int x, int y, int width, int height) {
        delegate.setClip(x, y, width, height);
    }

    @Override
    public Shape getClip() {
        return delegate.getClip();
    }

    @Override
    public void setClip(Shape clip) {
        delegate.setClip(clip);
    }

    @Override
    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawPolygon(Polygon p) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fillPolygon(Polygon p) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawChars(char[] data, int offset, int length, int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drawBytes(byte[] data, int offset, int length, int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dispose() {
        delegate.dispose();
    }

    @Override
    @Deprecated
    public Rectangle getClipRect() {
        return delegate.getClipRect();
    }

    @Override
    public boolean hitClip(int x, int y, int width, int height) {
        return delegate.hitClip(x, y, width, height);
    }

    @Override
    public Rectangle getClipBounds(Rectangle r) {
        return delegate.getClipBounds(r);
    }
}