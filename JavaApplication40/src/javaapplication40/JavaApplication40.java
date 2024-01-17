/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;
import java.util.*;
/**
 *
 * @author Alex_
 */
public class JavaApplication40 {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main (String [] args){
         first();
    }
    public static void first() {
      int [] list = new int [5];
        for (int i = 0; i < 5; i++) {
            list [i] = sc.nextInt ();
        }
        System.out.println(maxium(list));
        System.out.println(minium(list));
    }
    public static int maxium (int list[]){
        int a = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >=0; j--) {
                if (list [i]>list [j]){
                   a = list [i];
            }
            }
        }
        return a;
    }
    public static int minium (int list []){
        int a = 0;
        for (int i = 4; i >=0; i--) {
            for (int j = 0; j < 5; j++) {
                if (list[i]<list[j]){
                    a=list[i];
                }
            }
        }
        return a;
    }
}
