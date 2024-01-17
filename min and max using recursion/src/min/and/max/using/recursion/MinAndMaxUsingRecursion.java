/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min.and.max.using.recursion;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class MinAndMaxUsingRecursion {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the array number");
        int n = sc.nextInt();
        int [] i = new int [n];
        for (int j = 0; j < n; j++) {
            i [j] = sc.nextInt();
        }
        System.out.println("max is: "+max(i[]));
        System.out.println("min is: "+min(i[]));
    }
    public static int max (int i []){
        
        return i;
        System.out.println("");
    }
   public static int min (int i){
        
        return i;
    }
}
