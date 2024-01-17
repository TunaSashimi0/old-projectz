/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alex_
 */
public class Information extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new Information ();
    }
    public Information (){
        this.setSize (400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Personal Information");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel ("Alex");
        panel1.add(label1);
        this.add(panel1);
        this.setVisible(true);
        Icon icon = new ImageIcon(getClass().getResource("download.jfif")); 
        JLabel label = new JLabel("An icon", download.jfif);
    }
}
