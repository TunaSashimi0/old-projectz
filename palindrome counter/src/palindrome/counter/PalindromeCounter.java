/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.counter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class PalindromeCounter {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String word = sc.nextLine();
       String word2 = word;
        char c;
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList ();
        int count = 0;
        for (int i = 0; i <word.length() ; i++) {
            palindrome(word.substring(i),word.substring(i),count);
        }
       
        System.out.println(count);
    }
    static int palindrome (String a, String b, int count){
        
        ArrayList x = new ArrayList();
        ArrayList y = new ArrayList();
        for (int i = 0; i < a.length(); i++) {
              x.add(a.charAt(i));
        }
        for (int i = b.length()-1;  i >= 0; i--){
        y.add(b.charAt(i));
        }
        for (int i = 0; i < x.size() ; i++) {
            if (x.get(i).equals( y.get(i))){
                count +=1;
            }
        } 
        return count;
    }
    
}
