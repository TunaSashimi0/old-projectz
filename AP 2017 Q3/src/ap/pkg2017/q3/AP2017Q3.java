/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2017.q3;

import java.util.Scanner;



/**
 *
 * @author Alex_
 */
public class AP2017Q3 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p = sc.nextLine();
        Phrase j = new Phrase (p);
        j.replaceNthOccurrence("at", 1, "rane");
 
        System.out.println(j);
        System.out.println(j.findLastOccurrence("at"));
        
    }
    
}
class Phrase {
private String currentPhrase;
public Phrase (String p){
    currentPhrase = p;
}
public int findNthOccurrence (String str, int n){
    n-=1;
    int pos = -1;
    do {
        pos = currentPhrase.indexOf(str, pos + 1);
    } while (n-- > 0 && pos != -1);
    return pos;
    
}
public void replaceNthOccurrence (String str, int n, String relp){
    
    int x = this.findNthOccurrence(str,n);
    if (x!= -1){
        currentPhrase = currentPhrase.substring(0,x)+relp+currentPhrase.substring(x+str.length());
    }
    
    
}
public int findLastOccurrence (String str){
    
    return currentPhrase.lastIndexOf(str) - str.length();
    
}
public String toString(){
    return currentPhrase;
}

}