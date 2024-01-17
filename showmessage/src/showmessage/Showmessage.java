/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmessage;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alex_
 */
public class Showmessage extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Showmessage ();
    }
    public Showmessage (){
        this.setSize (400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello World");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel ("Hello World");
        panel1.add(label1);
        this.add(panel1);
        this.setVisible(true);
        
    }
}
