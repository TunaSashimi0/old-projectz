/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
       
        int N = sc.nextInt();
        int[] xcord = new int[N];
        int[] ycord = new int[N];
        for (int i = 0; i < N; i++) {
            String c = sc.next();
            int x = Integer.parseInt(c.replaceAll(",.*", ""));
            xcord[i] = x;
        int y = Integer.parseInt(c.replaceAll(".*,", ""));
        ycord[i] = y;
        
        }
        Arrays.sort(xcord);
        Arrays.sort(ycord);
        int bigx =  xcord[xcord.length-1];
        bigx+=1;
        int bigy = ycord[ycord.length-1];
        bigy+=1;
        int smallx = xcord[0]-1;
        int smally = ycord[0]-1;
        System.out.println(smallx+","+smally);
        System.out.println(bigx+","+bigy);
    }
    
}
