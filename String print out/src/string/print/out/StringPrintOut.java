/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.print.out;

/**
 *
 * @author Alex_
 */
public class StringPrintOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\"this is \n very strange\"");
        int n = 0;
        while (n!=50){
            n = (int)(Math.random()*49)+2;
            System.out.println(n);
        }
    }
    
}
