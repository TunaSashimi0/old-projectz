/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.fibonacci.terms;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class MinimumFibonacciTerms {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int k = sc.nextInt();
       
    }
    static int fib (int n){
        int result = fib(n-2)+fib(n-1);
        return result;
    }
    
}
