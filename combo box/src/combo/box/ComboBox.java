/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combo.box;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class ComboBox extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ComboBox();
        
    }
    
    public JComboBox combo1;
    public  JButton buttonOK;
    public ComboBox()
    {
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(this);
        this.setTitle("Combo Box");
        
        buttonOK=new JButton("OK");
        
        JPanel panel1 = new JPanel(); 
        JLabel label1 = new JLabel("Your favorite:");
        
        combo1 = new JComboBox();
        combo1.addItem("Bashful"); 
        combo1.addItem("Doc"); 
        combo1.addItem("Dopey");
        combo1.addItem("Grumpy"); 
        combo1.addItem("Happy");
        combo1.addItem("Sleepy"); 
        combo1.addItem("Sneezy");
        /*String[] theSeven = {“Bashful”, “Doc”, “Dopey”, “Grumpy”, “Happy”, “Sleepy”, “Sneezy”}; 
            JComboBox combo1 = new JComboBox(theSeven);
        */
         panel1.add(label1); 
         panel1.add(combo1);
         panel1.add(buttonOK);
        buttonOK.addActionListener(this);
        
        this.add(panel1);
        this.setVisible(true);   
 
    }
    
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == buttonOK) 
        { 
            String s = (String)combo1.getSelectedItem(); 
        JOptionPane.showMessageDialog(combo1, "You picked " + s, "Your Favorite",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
