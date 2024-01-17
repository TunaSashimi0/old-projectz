/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profit;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Alex_
 */
public class Profit {
static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <Integer> ();
        int x;
        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
             x = sc.nextInt();
            if (x == 0){
                st.pop();
            }
            else {
                st.push(x);
            }
        }
        int sum = 0;
        for (int j = 0; j <= st.size(); j++) {
            sum = sum + st.pop();
        }
        System.out.println(sum);
    }
    
}
