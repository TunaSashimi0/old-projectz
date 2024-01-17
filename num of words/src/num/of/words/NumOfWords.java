/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num.of.words;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class NumOfWords {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Letters());
    }
    public static int Letters (){
         int counter = 1;
        String s = sc.nextLine ();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                counter += 1;
            }
        }
        return counter;
    }
}
