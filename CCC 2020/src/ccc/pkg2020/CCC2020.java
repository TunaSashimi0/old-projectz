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
        int s =sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        int happy = 0;
        happy = s+2*m+3*l;
        if (happy>=10){
            System.out.println("happy");
        }
        else if (happy<10){
            System.out.println("sad");
        }
                }
    
}
