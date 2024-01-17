/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist3;

import java.util.LinkedList;

/**
 *
 * @author Alex_
 */
public class LinkedList3 {

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
        for (String s : officers ){
            System.out.println(s);
        }
}}
