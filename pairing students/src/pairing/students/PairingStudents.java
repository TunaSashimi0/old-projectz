/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairing.students;
import java.util.Scanner;
/**
 *
 * @author Alex_
 */
public class PairingStudents {
 static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        students students = new students();
    }
    
}
class students {
    static Scanner sc = new Scanner (System.in);
    public students (){
        int i;
        System.out.println("enter a student number");
        i = sc.nextInt();
        String [] names = new String [i];
        for (int j = 0; j < i; j++) {
            names [i] = sc.nextLine();
        }
        
    }
   
}
