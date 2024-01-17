/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Alex_
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int P = sc.nextInt();
       int N = sc.nextInt();
       int R = sc.nextInt();
       int x = N;
       int y=0;
       int day = 0;
       
       while (N<=P){
           x=x*R;
           N=N+x;
           day= day+1;
       }
        System.out.println(day);
    }
    
}
