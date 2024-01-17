/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change.image;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alex_
 */
public class ChangeImage extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       new ChangeImage();
    }
    public ChangeImage () Throws IOException 
    
    {
        BufferedImage img = ImageIO.read(new File ("C://"));
        ImageIcon icon = new ImageIcon (img);
        this.setSize (800,600);
        JLabel lbl = new JLabel ();
        lbl.setSize (400,200);
        this.add(lbl);
        this.setVisible (true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
