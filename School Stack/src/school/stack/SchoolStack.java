/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.stack;
import java.util.*;

/**
 *
 * @author Alex_
 */
public class SchoolStack {
static Scanner sc = new Scanner (System.in);

public static ArrayList<String> s2 = new ArrayList <String>( );

    static void way (Stack st, String s, Stack st2, int i){
        
        if (s.equals("R")){
            st.push("turn "+s+" ");
            s2.add (i, st.pop().toString());
        }
        else if (s.equals("L")){
            st.push ("turn "+s+" ");
            s2.add (i, st.pop().toString());
        }
        else if (s.equals("HOME")|s.equals("SCHOOL")){
            st.push ("onto "+s+" ");
            s2.add (i, st.pop().toString());
        }
        else{
           st.push ("onto "+s+" street"); 
           s2.add (i, st.pop().toString());
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack st = new Stack ();
       Stack st2 = new Stack ();
       int i = -1 ;
       
       String s = "";
       while (!s.equals("SCHOOL") ){
           i +=1;
           s = sc.nextLine();
           way (st,s, st2, i);  
          
        } 
        for (int j = i; j >= 0; j--) {
            System.out.println(s2.get(j));
        }
    }
    
}

