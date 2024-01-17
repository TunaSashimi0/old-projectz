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
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean ans = false;
        for (int i = 0; i < b.length(); i++) {
            b = b.substring(1) + b.substring(0, 1);
            if (a.indexOf(b)!=-1){
                ans = true;
            }
        }
        if (ans==true){
            System.out.println("yes");
        }
        else if (ans==false){
            System.out.println("no");
        }
       
    }
    
}
