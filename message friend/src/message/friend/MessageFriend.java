/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.friend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class MessageFriend {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
      int m = sc.nextInt();
      int time = -1;
      ArrayList friend = new ArrayList();
      String s = new String();
      for (int i = 0; i<m ; i++){
          
       s = in.readLine();
       
       
       if (s.substring(0,1).equals("R")){
           time =time +1;
           friend.add(s.substring(2));
       }
       if (s.substring(0,1).equals("W")){
           time = time +1;
       }
       if (s.substring(0,1).equals("S")){
           time = time +1;
           for (int j = 0; j < friend.size(); j++) {
               if (s.substring(2).equals(friend.get(j))){
                   System.out.println(friend.get(j)+" "+time);
               }
           }
       }
     }
     
    }
    
}
