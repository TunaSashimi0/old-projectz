/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hard.way.converter;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Alex_
 */
public class HardWayConverter extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new HardWayConverter ();
    }
    
    private JButton convert;
    private JButton clear;
    private JButton exit;
    private JTextField F;
    private JTextField C;
    double f;
    double c;
    
    
    public HardWayConverter (){
    this.setSize(300, 200);
    this.setTitle ("Converter");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ButtonListener b1 = new ButtonListener ();
        JPanel panel1 = new JPanel ();
        panel1.add(new JLabel("Fahrenheit"));
        F = new JTextField (15);
        panel1.add (F);
        panel1.add(new JLabel("Celsius"));
        C = new JTextField (15);
        panel1.add (C);
        clear = new JButton ("Clear");
        exit = new JButton ("Exit");
        convert = new JButton ("Convert");
        convert.addActionListener (b1);
        exit.addActionListener (b1);
        clear.addActionListener (b1);
        panel1.add(convert);
        panel1.add(clear);
        panel1.add(exit);
        this.add(panel1);
        this.setVisible (true);
        this.setLocationRelativeTo(null);
        TextFieldListener t1 = new TextFieldListener ();
        C.addActionListener(t1);
        
    }
    
    private class ButtonListener implements ActionListener {
        
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==convert){
             if (f!=0&&c==0){
               c = (f-32)*5/9;
               C.setText(Double.toString(c));
           }
           else if (c!=0 && f==0 ){
               f = c*9/5+32;
               F.setText(Double.toString(f));
          }
        }
        else if (e.getSource()==clear){
            c=0;
           C.setText("");
           f=0;
           F.setText("");
        }
        else if (e.getSource () == exit){
            System.exit(0);
        }
    }
    
}  
    private class TextFieldListener implements ActionListener {
        
     private void CActionPerformed(java.awt.event.ActionEvent evt) {                                  

        c = Double.parseDouble( C.getText() );
        C.setText(Double.toString(c));
        
       
    }                                 

    private void FActionPerformed(java.awt.event.ActionEvent evt) {                                  
       
        f = Double.parseDouble( F.getText() );
        F.setText(Double.toString(f));
    }               
}
          
}
