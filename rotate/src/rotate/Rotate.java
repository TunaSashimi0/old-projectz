/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class Rotate {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k=0;
        String [] letters = new String [7];
        letters [0] = "I";
        letters [1] = "O";
        letters [2] = "S";
        letters [3] = "H";
        letters [4] = "Z";
        letters [5] ="X";
        letters [6] = "N";
        System.out.println("enter a word");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String s = Character.toString(c);
            for (int j = 0; j < 6; j++) {
                if (s.equals(letters [j])){
                    k+=1;
                   
                }
            }
        }
        if(k==word.length()-1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        
    }
    
}
