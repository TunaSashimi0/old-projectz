/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button.example;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Alex_
 */
public class ButtonExample extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ButtonExample();
        
    }
    private JButton button1;
    private JButton button2;
    
    public ButtonExample (){
    this.setSize(3000,2000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle ("i'm listening");
    JPanel panel1 = new JPanel ();
    button1 = new JButton ("Click Me!");
    button2 = new JButton ("Exit");
    button1.addActionListener (this);
    button2.addActionListener (this);
    panel1.add(button2);
    panel1.add(button1);
    this.add(panel1);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
}
    private int clickCount = 0;
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==button1){
            clickCount ++;
            if(clickCount == 1){
                button1.setText("i've been clicked!");
            }
            else {
                button1.setText("i've been clicked "+clickCount+" times!");
            }
        }
        if (e.getSource()==button2){
            System.exit(0);
        }
    }
}
