/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc.pkg2020.j5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class CCC2020J5 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        int m = sc.nextInt();
        int n = sc.nextInt();
        String s = new String();
        int [][] room = new int [m][n];
        int [] splited = new int [200];
        String [] a = new String [n];
        for (int i = 0; i < m; i++) {
            s = sc.next();
            for (int j = 0; j < n; j++) {
                 a [] = s.split("\\s+");
                 room [i][j]  = Integer.parseInt(a[j]);
            }
        }
        System.out.println(room);
    }
    
}
