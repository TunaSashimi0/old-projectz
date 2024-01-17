/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link.list.pkg1;
import java.util.*;
/**
 *
 * @author Alex_
 */
public class LinkList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> officers = new LinkedList <String>();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("pierce");
        officers.add("McIntyre");
        for (String s : officers){
            System.out.println(s);
        }
    }
    
}
