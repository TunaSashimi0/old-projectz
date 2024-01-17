/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2016.q1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alex_
 */
public class AP2016Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String [] wordArray = {"wheels", "on", "the", "bus"};
      RandomStringChooser sChooser = new RandomStringChooser (wordArray);
        for (int i = 0; i < 6 ; i++) {
            System.out.print(sChooser.getNext() + " ");
        }
    }
    
}

class RandomStringChooser {
    
    public static ArrayList <String> word2;
    
    public RandomStringChooser (String [] word) {
        word2 = new  ArrayList <> ();
        for (int i = 0; i < word.length; i++) {
            word2.add(word[i]);
        }
        
    }
    
    public String getNext () {
        
        if (word2.isEmpty()){
            return "none";
        }
        Random r=new Random();
        int randomNumber=r.nextInt(word2.size());
        return word2.remove(randomNumber);
        
        
        
    }
    
}

