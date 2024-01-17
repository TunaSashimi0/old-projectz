/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angry.bird;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class AngryBird {

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */


    public static void main(String[] args) {
        new AngryBird();
    }

    public AngryBird() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                if (supportsPerAlphaPixel()) {
                    try {
                        JFrame frame = new JFrame("Testing");
                        frame.setUndecorated(true);
                        setOpaque(frame, false);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setLayout(new BorderLayout());
                        frame.add(new PaintPane());
                        frame.pack();
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);

                    } catch (Exception exp) {
                        exp.printStackTrace();
                    }
                } else {
                    System.err.println("Per pixel alphering is not supported");
                }
            }
        });
    }

    public static boolean supportsPerAlphaPixel() {
        boolean support = false;
        try {
            Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
            support = true;
        } catch (Exception exp) {
        }
        return support;
    }

    public static void setOpaque(Window window, boolean opaque) throws Exception {
        try {
            Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
            if (awtUtilsClass != null) {
                Method method = awtUtilsClass.getMethod("setWindowOpaque", Window.class, boolean.class);
                method.invoke(null, window, opaque);
            }
        } catch (Exception exp) {
            throw new Exception("Window opacity not supported");
        }
    }

    public class PaintPane extends JPanel {

        private BufferedImage img;

        private int xPos, yPos = 100;
        private int xDelta = 0;
        private int yDelta = 0;

        public PaintPane() {
            while (xDelta == 0) {
                xDelta = (int) ((Math.random() * 1000)) - 5;
            }
            while (yDelta == 0) {
                yDelta = (int) ((Math.random() * 1000)) - 5;
            }
            setOpaque(false);
            try {
                img = ImageIO.read(new File("C:\\Users\\Alex_\\Documents\\NetBeansProjects\\angry bird\\angrybird2.png"));

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    xPos += xDelta;
                    yPos += yDelta;
                    if (xPos - (img.getWidth() / 2) <= 0) {
                        xPos = img.getWidth() / 2;
                        xDelta *= -1;
                    }
                    if (xPos + (img.getWidth() / 2) >= getWidth()) {
                        xPos = getWidth() - (img.getWidth() / 2);
                        xDelta *= -1;
                    }
                    if (yPos - (img.getHeight() / 2) <= 0) {
                        yPos = img.getHeight() / 2;
                        yDelta *= -1;
                    }
                    if (yPos + (img.getHeight() / 2) >= getHeight()) {
                        yPos = getHeight() - (img.getHeight() / 2);
                        yDelta *= -1;
                    }
                    repaint();
                }
            });
            timer.start();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1000, 700);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(new Color(128, 128, 128, 128));
            g2d.fillRect(0, 0, getWidth(), getHeight());
            int x = xPos - (img.getWidth() / 2);
            int y = yPos - (img.getHeight() / 2);
            g2d.drawImage(img, x, y, this);
            g2d.dispose();

        }
    }
}
