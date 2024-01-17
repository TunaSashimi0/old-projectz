/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Alex_
 */
public class SetLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> officers = new LinkedList <>();
        officers.addFirst ("Blake");
        officers.addFirst ("burns");
        officers.addFirst ("Houlihan");
        officers.addFirst ("Pierce");
        officers.addFirst ("McIntyre");
        officers.add(2,"tuttle");
        System.out.println(officers);
        officers.set(2, "murdock");
        System.out.println("\ntuttle is replaced: ");
        System.out.println(officers);
    }
    
}
