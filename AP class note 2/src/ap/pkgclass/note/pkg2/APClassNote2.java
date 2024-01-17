/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkgclass.note.pkg2;

import java.util.Random;

/**
 *
 * @author Alex_
 */
public class APClassNote2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random generator = new Random();
       int num1;
       float num2;
       num1 = generator.nextInt();
        System.out.println("A random integer: "+num1);
        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: "+num1);
        num1 = generator.nextInt(10)+1;
        System.out.println("From 1 to 10 " + num1);
        num1 = generator.nextInt(15)+20;
        System.out.println("From 20 to 34 "+ num1);
        num1 = generator.nextInt (20)-10;
        System.out.println("from -10 to 9: "+num1);
        num2 = generator.nextFloat();
        System.out.println("A random float [between 0-1] "+num2);
        num2 = generator.nextFloat()*6;
        num1 = (int) num2 +1;
        System.out.println("from i to 6 "+num1);
    }
    
}
