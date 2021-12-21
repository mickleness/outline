package com.pump.awt.geom.swing;

import com.pump.awt.geom.outline.RectangleMask;
import com.pump.awt.geom.outline.RectangleMask2D;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;

public class MaskPaintApp extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MaskPaintApp app = new MaskPaintApp();
                app.pack();
                app.setVisible(true);
            }
        });
    }

    class Workspace extends JComponent {

        Line2D currentShape;
        RectangleMask mask = new RectangleMask();
        double scale = 4;
        Stroke stroke = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

        MouseInputAdapter mouseListener = new MouseInputAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                currentShape = new Line2D.Double(e.getPoint(), e.getPoint());
            }

            @Override
            public void mouseDragged(MouseEvent e) {

                // TODO: implement a quad smoother

                currentShape.setLine(currentShape.getP1(), e.getPoint());
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                AffineTransform tx = AffineTransform.getScaleInstance(scale, scale);
                mask.add(tx.createTransformedShape(stroke.createStrokedShape(currentShape)), .1);
                repaint();
                currentShape = null;
            }
        };

        {
            setPreferredSize(new Dimension(800, 800));
            addMouseListener(mouseListener);
            addMouseMotionListener(mouseListener);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.scale(1f/scale, 1f/scale);
            g2.setColor(Color.black);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fill(mask);
            g2.dispose();

            if (currentShape != null) {
                Graphics2D g3 = (Graphics2D) g.create();
                g3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g3.setColor(new Color(0,0,0,100));
                g3.setStroke(stroke);
                g3.draw(currentShape);
                g3.dispose();
            }
        }
    }

    // TODO: add alt Area-based implementation

    Workspace workspace = new Workspace();

    public MaskPaintApp() {
        getContentPane().add(workspace);
    }
}
