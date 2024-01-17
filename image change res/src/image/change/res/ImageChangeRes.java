/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.change.res;



import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class ImageChangeRes extends Component {
    BufferedImage img;
    Image nimg;
    public void paint(Graphics g) {
        g.drawImage(nimg, 0, 0, null);
    }

    public ImageChangeRes() {
       try {
           img = ImageIO.read(new File("C:\\Users\\Alex_\\Pictures\\Cars\\NBPEcfv.jpg"));
           nimg = img.getScaledInstance(1024, 768, img.SCALE_DEFAULT);
       } catch (IOException e) { }
    }

    public Dimension getPreferredSize() {
        if (nimg == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(nimg.getWidth(null), nimg.getHeight(null));
       }
    }
    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
        JPanel pnl1=new JPanel();    
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        f.add(pnl1);
        pnl1.add(new ImageChangeRes());
        f.pack();
        f.setVisible(true);
    }
}

