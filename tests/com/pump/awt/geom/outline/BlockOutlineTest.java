package com.pump.awt.geom.outline;

import com.pump.awt.geom.outline.BlockOutline;
import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedHashSet;

public class BlockOutlineTest extends TestCase {

    @Test
    public void testEmptyContains() {
        BlockOutline mask = new BlockOutline();
        assertFalse(mask.contains(0, 0));
    }

    @Test
    public void testAddContains() {
        Collection<Rectangle> rects = new LinkedHashSet<>();
        for(int x = 0; x<5; x++) {
            for(int y = 0; y<5; y++) {
                for(int width = 1; width<5; width++) {
                    for(int height = 1; height<5; height++) {
                        rects.add(new Rectangle(x, y,
                                Math.min(width, 5 - x),
                                Math.min(height, 5 - y)));
                    }
                }
            }
        }
        for(Rectangle r1 : rects) {
            for(Rectangle r2 : rects) {
                for(Rectangle r3 : rects) {
                    for(Rectangle r4 : rects) {
                        testAddContains(r1, r2, r3, r4);
                    }
                }
            }
        }
    }

    private void testAddContains(Rectangle... rects) {
        boolean[][] matrix = new boolean[5][5];
        for(int y = 0; y<matrix.length; y++) {
            for(int x = 0; x<matrix.length; x++) {
                for(Rectangle rect : rects) {
                    if (rect.contains(x,y)) {
                        matrix[y][x] = true;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        BlockOutline outline = new BlockOutline();
        for(Rectangle rect : rects) {
            sb.append(rect+" ");
            outline.add(rect);
        }

        for(int y = 0; y<matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                assertEquals("x = "+x+", y = "+y+", rects = "+sb, matrix[y][x], outline.contains(x, y));
            }
        }
    }
}
