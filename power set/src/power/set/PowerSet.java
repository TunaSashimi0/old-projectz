/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.set;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class PowerSet {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = sc.nextLine ();
        ArrayDeque <Character> que = new ArrayDeque <> ();
        for (int i = 0; i< s.length();i++){
            que.add(s.charAt(i));
        }
        while (que.size()>0){
            System.out.println(que.pop());
            System.out.println(que);
        }
    }
    
}
