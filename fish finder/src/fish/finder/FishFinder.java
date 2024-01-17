/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.finder;
import java.util.Scanner;
/**
 *
 * @author Alex_
 */
public class FishFinder {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int one = sc.nextInt ();
       int two = sc.nextInt ();
       int three = sc.nextInt();
       int four = sc.nextInt();
       if (one<two && two < three && three < four ){
           System.out.println("Fish Rising");
       }
       else if (one>two && two > three && three > four){
           System.out.println("Fish Diving");
       }
       else if (one == two && one == three && one== four ){
           System.out.println("Fish At Constant Depth");
       }
       else {
           System.out.println("No Fish");
       }
    }
    
}
