/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.game;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class DiceGame {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int points1 = 100;
       int points2 = 100;
       int rounds;
       rounds = sc.nextInt();
       String [] s = new String [2];
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < 2; j++) {
                s [j] = sc.nextLine();
                char s1 = s[j].charAt(0);
                char s2 = s[j].charAt(2);
                if ((int)s1==(int)s2){
                
            }
            else if(s1<s2){
                points1 = points1 - (int)s2;
            }
            else if (s2<s1){
                points2 = points2 -(int)s1;
            }
            }
            
            
           
        }
        System.out.println(points1);
        System.out.println(points2);
    }
    
}
