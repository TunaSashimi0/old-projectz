/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.jframe;
import javax.swing.*;
/**
 *
 * @author Alex_
 */
public class HelloWorldJframe extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HelloWorldJframe ();
    }
    public HelloWorldJframe (){
    this.setSize(400,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Hello World!");
    this.setVisible(true);
    this.setLocation(200,400);
    this.setLocationRelativeTo(null);
}
}
