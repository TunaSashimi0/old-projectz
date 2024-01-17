/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeding;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Alex_
 */
public class Greeding extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Greeding ();
        
    }
    private JButton buttonok;
    private JTextField textName;
    public Greeding (){
        this.setSize(600,300);
        this.setTitle("Who are you?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ButtonListener b1 = new ButtonListener ();
        JPanel panel1 = new JPanel ();
        panel1.add(new JLabel("Enter your name: "));
        textName = new JTextField (15);
        panel1.add (textName);
        buttonok = new JButton ("ok");
        buttonok.addActionListener (b1);
        panel1.add(buttonok);
        this.add(panel1);
        this.setVisible (true);
        this.setLocationRelativeTo(null);
}
    private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==buttonok){
            String name = textName.getText();
            if(name.length()==0){
                JOptionPane.showMessageDialog(Greeding.this,"you didn't enter anything!",
                        "Moron",JOptionPane.INFORMATION_MESSAGE);
                
            }
            else {
                JOptionPane.showMessageDialog(Greeding.this,"Good morning "+ name,
                        "Salutations",JOptionPane.INFORMATION_MESSAGE);
                
            }
            textName.requestFocus();
        }
    }
}
}
