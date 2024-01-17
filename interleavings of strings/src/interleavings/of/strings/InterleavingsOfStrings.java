/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interleavings.of.strings;

import java.util.ArrayList;

/**
 *
 * @author Alex_
 */
public class InterleavingsOfStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <String> abc = new ArrayList <>();
        abc.add("A");
        abc.add("B");
        abc.add("C");
        ArrayList <String> acb = new ArrayList <>();
        acb.add("A");
        acb.add("C");
        acb.add("B");
        ArrayList <String> result = new ArrayList <>();
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result.addAll(abc);
                result.addAll(j,acb);
                System.out.println(result);
                result.clear();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result.addAll(acb);
                result.addAll(j,abc);
                System.out.println(result);
                result.clear();
            }
        }
        result.addAll(abc);
        result.addAll(acb);
        System.out.println(result);
        result.clear();
        result.addAll(acb);
        result.addAll(abc);
        System.out.println(result);
        result.clear();
        
    }
    
}
