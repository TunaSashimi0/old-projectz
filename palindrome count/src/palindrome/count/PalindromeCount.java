/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.count;
import java.util.*;
/**
 *
 * @author Alex_
 */
public class PalindromeCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.println("enter your string for hidden palindrome");
        String s = input.nextLine();
        outerloop:
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(j,s.length()))){
                    System.out.println(s.length()-j);
                    break outerloop;
                }
            }
        }
    }
     static boolean isPalindrome(String s){
          int len=s.length();
          for (int i = 0; i < len/2; i++) {
              if (s.charAt(i)!=s.charAt(len-i-1))
                  return false;
          }
          return true;
      }
}
