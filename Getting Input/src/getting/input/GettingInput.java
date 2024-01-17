/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getting.input;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex_
 */
public class GettingInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s;
       s = JOptionPane.showInputDialog("Enter an Integer:");
       BigInteger myInt = new BigInteger (s);
        System.out.println("You entered "+s+".");
       String y;
       String bi = myInt.toString(2);
        String hex = myInt.toString (16);
        String octal  = myInt.toString (8);
       JOptionPane.showMessageDialog(null, "The Binary is: " +bi+ "\n" +"The Hex is: "+hex+"\n"+"The Octal is: "+octal );
    }
    
}
