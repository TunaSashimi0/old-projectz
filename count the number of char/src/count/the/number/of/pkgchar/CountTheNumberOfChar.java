/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.the.number.of.pkgchar;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class CountTheNumberOfChar {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int count = 0;
       
        String s = sc.nextLine();
        Character c = s.charAt(0);
        String s2 = sc.nextLine();
        
        for(int n = 0; n< s2.length() ; n++){
            if (c == s2.charAt(n)){
                count +=1;
            }
        }
        
        System.out.println(count);
       
    }
    
}
