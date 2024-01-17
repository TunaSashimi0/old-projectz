/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.pkginterface;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Alex_
 */
public class QueueInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println("elements of queue - "+q);
        int removedele = q.remove();
        System.out.println("removed element "+removedele);
        System.out.println(q);
        int head = q.peek();
        System.out.println("head of queue "+head);
        int size = q.size();
        System.out.println("size of queue "+size);
    }
    
}
