/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2017.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class AP2017Q1 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = sc.nextInt();
        Digits ok = new Digits (i);
        System.out.println(ok.digitList);
        System.out.println(ok.isStrictlyIncreasing());
    }
    
}

class Digits {
    
    public static ArrayList <Integer> digitList;
    
    public Digits (int num){
        
        digitList = new <Integer> ArrayList();
        
        if (num == 0){
            digitList.add(0);
        }
        
        while (num>0){
            
            this.digitList.add(0 , num%10);
            num = num/10;
            
        }
        
        
        
        
    }
    
    public boolean isStrictlyIncreasing() {
        ArrayList <Integer> temp = new ArrayList ();
        for (int i = 0 ; i < digitList.size()-1;i++){
            
            if (digitList.get(i)>= digitList.get(i+1)){
                return false;
            }
            
        }
        
        return true;
    }
    
    
    }

