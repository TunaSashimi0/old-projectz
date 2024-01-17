/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.string.in.zig.zag;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class PrintStringInZigZag {
static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int k = sc.nextInt();
      String problem = "THISPROBLEMISAWESOME";
      String a = new String();
      String b = new String ();
      String c = new String ();
      String d = new String ();
      String e = new String ();
      String result = new String();
     for (int j = 1; j <= k; j++) {
        for (int i = 0; i < problem.length(); i++) {
            
            Character x = problem.charAt(i);
          
                switch (j){
                    case 1: a = a + x.toString();
                    break;
                    case 2 : b = b+x.toString();
                    break;
                    case 3: c = c+x.toString();
                    break;
                    case 4: d = d+x.toString();
                    break;
                }
               result = a+b+c+d+e;     
                
            }
           
        }
         System.out.println(result);
    }
    
}
