/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package which.type.of.triangle;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class WhichTypeOfTriangle {
 static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int k=0;
        int m=0;
        int [] angles = new int [3];
        for (int i = 0; i < 3; i++) {
            angles [i] = sc.nextInt();
            if (angles[i] == 60){
                k+=1;
            }
            else {
                k=0;
            }
            total = total+angles[i];
            for (int j = 0; j < 3; j++) {
                if (angles[i]==angles[j]){
                    m=m+1;
                }
            }
        }
        if (k==3){
            System.out.println("Equilateral");
        }
        else if (total == 180){
            if (m==2){
                System.out.println("Isosceles");
            }
            else if(m!=2&&k!=3){
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }
        
    }
    
}
