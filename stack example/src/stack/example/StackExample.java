/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.example;
import java.util.*;

/**
 *
 * @author Alex_
 */
public class StackExample {
static void showpush (Stack st, int a){
    st.push (new Integer (a));
    System.out.println("push("+a+")");
    System.out.println("stack: "+st);
}
static void showpop (Stack st){
    System.out.print("pop -> ");
    Integer a = (Integer) st.pop();
    System.out.println(a);
    System.out.println("stack: "+st);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: "+st);
        showpush(st,42);
        showpush(st,66);
        showpush (st,99);
        showpop(st);
        showpop(st);
        showpop(st);
        try{
            showpop(st);
            
        }
       catch (EmptyStackException e){
           System.out.println("empty stack");
       }
    }
    
}
