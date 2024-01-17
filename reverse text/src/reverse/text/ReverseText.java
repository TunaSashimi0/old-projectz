/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.text;
import java.util.*;

/**
 *
 * @author Alex_
 */
public class ReverseText {
public static String reverse (String s){
    int low = 0;
    int high = 0;
    Stack <String> stack = new Stack();
    for (int i = 0; i <s.length(); i++){
        if(s.charAt(i)==' '){
            stack.push(s.substring(low, high+1));
            low = high = i +1;
        }
        else{
            high = i;
            
        }
    }
    stack.push (s.substring(low));
    StringBuilder sb= new StringBuilder();
    while(!stack.empty()){
        sb.append(stack.pop()).append(' ');
        
    }
    return sb.substring (0,sb.length()-1);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String s = "preparation interview technical IT for material goog provide we";
     s= reverse(s);
        System.out.println(s);
      
    }
    
}
