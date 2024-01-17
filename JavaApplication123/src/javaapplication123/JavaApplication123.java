/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication123;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class JavaApplication123 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String ip = sc.nextLine();
       if (ip.contains(".")){
           ArrayList splited = new ArrayList();
           splited.add(ip.split("."));
           
       }
       else {
           System.out.println("invalid");
       }
       
    }
    
}
