/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author Alex_
 */
public class Recursion {
 static Scanner sc = new Scanner (System.in);
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       int n = sc.nextInt();
        System.out.println(p(n));
            
    }
     static int p ( int n){
         if (n==2){
             return 1;
         }
         else if (n==1){
             return 1;
         }
         else {
             int result = p(p (n-1))+p(n-p(n-1));
             return result ;
         }
       
    }
    
}
