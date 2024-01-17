/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtokenizer.example;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Alex_
 */
public class StringTokenizerExample {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int wordcount = 0;
      int characterCount = 0;
      String line, word;
      StringTokenizer tokenizer;
        System.out.println("please enter text (type DONE to quit): ");
        line = sc.next();
        
        while(!line.equals("DONE")){
            tokenizer = new StringTokenizer (line);
            while (tokenizer.hasMoreTokens()){
                word = tokenizer.nextToken();
                wordcount ++;
                characterCount += word.length();
                
            }
            line=sc.next();
        }
        System.out.println("number of words: "+wordcount);
        System.out.println("number of characters: "+characterCount);
    }
    
}
