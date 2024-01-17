/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydeque.example;
import java.util.ArrayDeque;
import java.util.Iterator;
/**
 *
 * @author Alex_
 */
public class ArraydequeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayDeque<String> aq = new ArrayDeque <String>();
       aq.add("A");
       aq.add("B");
       aq.add("C");
       aq.offerFirst("D");
       aq.offerLast("E");
       Iterator <String> itr = aq.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
    
}
