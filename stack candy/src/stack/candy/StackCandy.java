/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.candy;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Alex_
 */
public class StackCandy {
static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y = 0;
        int no = 0;
        Stack a = new Stack ();
        Stack b= new Stack ();
        Stack c = new Stack ();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if(j%2==0){
                    c.push(x);
                }
                else {
                    b.push(x);
                }
               
            }
            c.push(b);
            for (int j = 0; j < 4; j++) {
                if (!c.isEmpty()){
                    String s = c.pop().toString();
                if (s.equals("1234")){
                   y = i;
                    System.out.println("y");
                }
                else {
                    n = i;
                    System.out.println("n");
                }
                }
                
            }
            
        }
       
        
    }
    
}
