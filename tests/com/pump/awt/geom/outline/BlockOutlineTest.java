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
        int ctr = 0;
        for(Rectangle r1 : rects) {
            for(Rectangle r2 : rects) {
                for(Rectangle r3 : rects) {
                    for(Rectangle r4 : rects) {
                        ctr++;

                        try {
                            testAddContains(r1, r2, r3, r4);
                        } catch(RuntimeException | Error e) {
                            System.err.println("ctr = "+ctr+"\n"+r1+"\n"+r2+"\n"+r3+"\n"+r4);
                            throw e;
                        }
                    }
                }
            }
        }
        System.out.println("Processed "+ctr+" combinations");
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
                try {
                    assertEquals("x = " + x + ", y = " + y + ", rects = " + sb, matrix[y][x], outline.contains(x, y));
                } catch(RuntimeException | Error e) {

                    String str = "-------\n";
                    for(int y1 = 0; y1<matrix.length; y1++) {
                        str += "|";
                        for(int x1 = 0; x1<matrix.length; x1++) {
                            if (matrix[y1][x1]) {
                                str += "X";
                            } else {
                                str += " ";
                            }
                        }
                        str += "|\n";
                    }
                    str+="-------";

                    System.err.println(str);
                    throw e;
                }
            }
        }
    }
}
