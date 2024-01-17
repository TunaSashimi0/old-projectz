/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sort;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alex_
 */
public class ArraySort {
static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Integer> x = new ArrayList <> ();
       x.add(1);
       x.add(4);
       x.add(7);
       x.add(8);
       x.add(10);
       ArrayList <Integer> y = new ArrayList <> ();
       y.add(2);
       y.add(3);
       y.add(9);
       ArrayList <Integer> z = new ArrayList<>();
       z.addAll(x);
       z.addAll(y);

    for (int i = 0; i < z.size(); i++) {
       for(int j=i+1; j <z.size();j++)
       {
           if(z.get(i) > z.get(j))
           {
               int temp = z.get(j);
               z.set(j, z.get(i));
               z.set(i, temp);
           }
       }
    }
        System.out.println(z);
        for (int i = 0; i < z.size(); i++) {
            if (i<=4){
                x.set(i,z.get(i));
            }
            else if (i>4&&i<=7) {
                y.set(i-5,z.get(i));
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
    
}
