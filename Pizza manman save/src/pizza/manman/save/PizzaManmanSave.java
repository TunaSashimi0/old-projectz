/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.manman.save;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaManmanSave extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) 
    {
        GridBagConstraints gc = new GridBagConstraints(); 
        gc.gridx = x; 
        gc.gridy = y; 
        gc.gridwidth = width; 
        gc.gridheight = height; 
        gc.weightx = 100.0; 
        gc.weighty = 100.0; 
        gc.insets = new Insets(5, 5, 5, 5); 
        gc.anchor = align; 
        gc.fill = GridBagConstraints.NONE; p.add(c, gc);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new PizzaManmanSave();
    }
    JTextField name, phone, address; 
    JRadioButton small, medium, large, thick, thin; 
    JCheckBox pepperoni, mushrooms, anchovies; 
    JButton okButton, closeButton;
public PizzaManmanSave()
{
    this.setTitle("Pizza Order"); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel1 = new JPanel(); 
    panel1.setLayout(new GridBagLayout());
    addItem(panel1, new JLabel("Name:"), 0, 0, 1, 1, GridBagConstraints.EAST); 
    addItem(panel1, new JLabel("Phone:"), 0, 1, 1, 1, GridBagConstraints.EAST); 
    addItem(panel1, new JLabel("Address:"), 0, 2, 1, 1, GridBagConstraints.EAST);
    
    name = new JTextField(20);
    phone = new JTextField(10); 
    address = new JTextField(20);
    
    addItem(panel1, name, 1, 0, 2, 1, GridBagConstraints.WEST); 
    addItem(panel1, phone, 1, 1, 1, 1,GridBagConstraints.WEST); 
    addItem(panel1, address, 1, 2, 2, 1, GridBagConstraints.WEST); 
    
    Box sizeBox = Box.createVerticalBox(); 
    small = new JRadioButton("Small"); 
    medium = new JRadioButton("Medium"); 
    large = new JRadioButton("Large");
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small); 
    sizeGroup.add(medium); 
    sizeGroup.add(large);
    sizeBox.add(small); 
    sizeBox.add(medium); 
    sizeBox.add(large); 
    sizeBox.setBorder( BorderFactory.createTitledBorder("Size"));
    addItem(panel1, sizeBox, 0, 3, 1, 1, GridBagConstraints.NORTH);
    
    Box styleBox = Box.createVerticalBox(); 
    thin = new JRadioButton("Thin");
    thick = new JRadioButton("Thick");
    ButtonGroup styleGroup = new ButtonGroup();
    styleGroup.add(thin);
    styleGroup.add(thick);
    styleBox.add(thin); 
    styleBox.add(thick);
    styleBox.setBorder( BorderFactory.createTitledBorder("Style"));
    addItem(panel1, styleBox, 1, 3, 1, 1, GridBagConstraints.NORTH);
    Box topBox = Box.createVerticalBox(); 
    pepperoni = new JCheckBox("Pepperoni");
    mushrooms = new JCheckBox("Mushrooms"); 
    anchovies = new JCheckBox("Anchovies"); 
    ButtonGroup topGroup = new ButtonGroup();
    topGroup.add(pepperoni);
    topGroup.add(mushrooms); 
    topGroup.add(anchovies); 
    topBox.add(pepperoni); 
    topBox.add(mushrooms); 
    topBox.add(anchovies); 
    topBox.setBorder( BorderFactory.createTitledBorder("Toppings"));
    addItem(panel1, topBox, 2, 3, 1, 1, GridBagConstraints.NORTH);
    Box buttonBox = Box.createHorizontalBox(); 
    okButton = new JButton("OK");
    closeButton = new JButton("Close");
    buttonBox.add(okButton); 
    buttonBox.add(Box.createHorizontalStrut(20));
    buttonBox.add(closeButton);

    addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.NORTH);
    okButton.addActionListener(this);
    closeButton.addActionListener(this);
    this.add(panel1); 
    this.pack(); 
    this.setVisible(true);
}

 public void actionPerformed(ActionEvent e)
        { 
            String S1="", S2="";
            if (e.getSource() == okButton) { 
                String tops = "";
                 if(name.getText()!="")
                     S1=name.getText();
                 
                if (pepperoni.isSelected())
                  tops += "Pepperoni\n";
                if (mushrooms.isSelected()) 
                  tops += "Mushrooms\n"; 
                if (anchovies.isSelected()) 
                  tops += "Anchovies\n";
            String msg = S1+" ordered a "; 
            if (small.isSelected()) msg += "small pizza "; 
            if (medium.isSelected()) msg += "medium pizza ";
            if (large.isSelected()) msg += "large pizza ";
             if (thin.isSelected()) msg += "(thin) with ";
              if (thick.isSelected()) msg += "(thick) with ";
              
               if(address.getText()!="")
                     S2+="\n\t Delivery Address: \n"+address.getText();
               if(phone.getText()!="")
                     S2+="\n\t Phone: "+phone.getText();
            
            if (tops.equals("")) 
                msg += "no toppings."; 
            else msg += "the following toppings: \n" + tops;
            JOptionPane.showMessageDialog( okButton, msg+S2, "Your Order", JOptionPane.INFORMATION_MESSAGE);
            pepperoni.setSelected(false); 
            mushrooms.setSelected(false); 
            anchovies.setSelected(false); 
            small.setSelected(true);
            
            
            //************Save the information in a file******************
            
            File f = new File("C:\\Users\\Alex_\\Desktop\\New folder\\pizza.txt"); 
            
            try {
            PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(f,true)));// 
             out.println(msg+"  *** "+S2);
             out.flush();
             out.close();
             } catch (IOException ex) {
                  
                }
 
                }
            
            if (e.getSource() == closeButton) { 
                
                System.exit(0);
            }
        }


}
