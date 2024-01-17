/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication156;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class JavaApplication156 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = sc.nextLine ();
        for (int i=0; i< s.length (); i++){
            String temp = s.substring(0, i) + s.substring(i + 1);
            if (IsPanlindrome (temp) == true){
                System.out.println(i);
                break;
            }
        }
        System.out.println(-1);
      
    }
    public static boolean IsPanlindrome (String str) {
        int i = 0, j = str.length() - 1; 
 
        while (i < j) { 

            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--;
        }
        
        
    return true; 
    
    }
    

}
    
