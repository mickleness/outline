package com.pump.awt.geom.pixelmask;

import junit.framework.TestCase;

import java.awt.*;

public class PixelMaskTest extends TestCase {

    public void testEmptyContains() {
        PixelMask mask = new PixelMask();

        assertFalse(mask.contains(0, 0));
    }

    public void testContainsScenario1() {
        PixelMask mask = new PixelMask();
        mask.add(1, 2, 3, 4);

        String[] maskStr = new String[] {
                "     ",
                "     ",
                " XXX ",
                " XXX ",
                " XXX ",
                " XXX ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario2() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(2, 4, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                 " XX  ",
                 " XX  ",
                 "     ",
                 "  XX ",
                 "  XX ",
                 "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario3() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(2, 3, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                " XX  ",
                " XX  ",
                "  XX ",
                "  XX ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario4() {
        PixelMask mask = new PixelMask();
        mask.add(2, 3, 2, 2);
        mask.add(1, 1, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                " XX  ",
                " XX  ",
                "  XX ",
                "  XX ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario5() {
        PixelMask mask = new PixelMask();
        mask.add(2, 4, 2, 2);
        mask.add(1, 1, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                " XX  ",
                " XX  ",
                "     ",
                "  XX ",
                "  XX ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario6() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(4, 1, 2, 2);

        String[] maskStr = new String[] {
                "       ",
                " XX XX ",
                " XX XX ",
                "       ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario7() {
        PixelMask mask = new PixelMask();
        mask.add(4, 1, 2, 2);
        mask.add(1, 1, 2, 2);

        String[] maskStr = new String[] {
                "       ",
                " XX XX ",
                " XX XX ",
                "       ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario8() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(3, 1, 3, 2);

        String[] maskStr = new String[] {
                "       ",
                " XXXXX ",
                " XXXXX ",
                "       ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario9() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(2, 1, 4, 2);

        String[] maskStr = new String[] {
                "       ",
                " XXXXX ",
                " XXXXX ",
                "       ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario10() {
        PixelMask mask = new PixelMask();
        mask.add(2, 3, 2, 2);
        mask.add(1, 2, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                "  XX ",
                " XXX ",
                " XX  ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario11() {
        PixelMask mask = new PixelMask();
        mask.add(1, 2, 2, 2);
        mask.add(2, 3, 2, 2);

        String[] maskStr = new String[] {
                "     ",
                " XX  ",
                " XXX ",
                "  XX ",
                "     "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario12() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(4, 2, 2, 2);

        String[] maskStr = new String[] {
                "       ",
                " XX    ",
                " XX XX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario13() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(4, 1, 2, 3);

        String[] maskStr = new String[] {
                "       ",
                " XX XX ",
                " XX XX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario14() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 2, 2);
        mask.add(4, 0, 2, 4);

        String[] maskStr = new String[] {
                "    XX ",
                " XX XX ",
                " XX XX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario15() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 3, 2);
        mask.add(4, 0, 2, 4);

        String[] maskStr = new String[] {
                "    XX ",
                " XXXXX ",
                " XXXXX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario16() {
        PixelMask mask = new PixelMask();
        mask.add(1, 1, 5, 2);
        mask.add(4, 0, 2, 4);

        String[] maskStr = new String[] {
                "    XX ",
                " XXXXX ",
                " XXXXX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    public void testContainsScenario17() {
        PixelMask mask = new PixelMask();
        mask.add(4, 0, 2, 4);
        mask.add(1, 1, 5, 2);

        String[] maskStr = new String[] {
                "    XX ",
                " XXXXX ",
                " XXXXX ",
                "    XX ",
                "       "
        };

        testMask(mask, maskStr);
    }

    private void testMask(PixelMask mask, String[] maskStr) {
        for(int y = 0; y<maskStr.length; y++) {
            for(int x = 0; x<maskStr[y].length(); x++) {
                char ch = maskStr[y].charAt(x);
                boolean expected;
                if (ch == ' ') {
                    expected = false;
                } else if(ch=='X') {
                    expected = true;
                } else {
                    // was there a typo in test setup?
                    throw new IllegalStateException("ch = "+ch);
                }
                assertEquals("x = " + x + ", y = " + y, expected, mask.contains(x, y));
            }
        }
    }
}
