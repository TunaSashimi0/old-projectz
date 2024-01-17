/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.area.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Alex_
 */
public class TextAreaExample extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new TextAreaExample();
    }
    private JButton Button1 , Button2;
    private JTextArea TA1;
    
    public TextAreaExample(){
        this.setSize (600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Area Example");
        JPanel panel1 = new JPanel();
        JLabel label1= new JLabel ("enter something");
        Button1 = new JButton ("Message");
        Button2 = new JButton ("Exit");
        TA1 = new JTextArea (10,20);
        JScrollPane Scroll = new JScrollPane (TA1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        TA1.setLineWrap(true);
        TA1.setWrapStyleWord(true);
        Button1.addActionListener(this);
        Button2.addActionListener (this);
        panel1.add(label1);
        panel1.add(Scroll);
        panel1.add (Button1);
        panel1.add (Button2);
        this.add(panel1);
        this.setVisible (true);
        
       }
    public void actionPerformed (ActionEvent e){
        String s = TA1.getText();
        if (e.getSource()==Button1){
            JOptionPane.showMessageDialog(TextAreaExample.this, "You Enter:\n" +s);
            
        }
        if (e.getSource()==Button2){
            System.exit(0);
        }
    }
    
}
