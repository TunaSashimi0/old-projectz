/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolstack.stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author Alex_
 */
public class SchoolstackStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Stack <String> dir = new Stack<>();
        Stack <String> place = new Stack<>();
        String s = br.readLine();
        while (!s.equals("SCHOOL")){
            switch (s){
                case "R":
                    dir.push("LEFT");
                    break;
                case "L":
                    dir.push("RIGHT");
                    break;
                default:
                    place.push(s);
                    break;
            }
            s = br.readLine();
            
        }
        while (!place.isEmpty()){
            System.out.println("Turn "+dir.pop()+" onto "+place.pop()+" street.");
        }
        System.out.println("Turn "+dir.pop()+" into your HOME");
    }
    
}
