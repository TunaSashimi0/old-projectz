/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking.list;

/**
 *
 * @author Alex_
 */
public class CheckingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100000;
       int [] numbers = new int [n+10];
       while (n!=0){
           for (int i = n-1; i>0;i--){
              if (numbers [n]==numbers[i]) {
                  System.out.println("true");
              }
           }
           n=n-1;
       }
        System.out.println("False");
        
        for (int j=n-1;j>0;j--){
            if (numbers [n]==numbers [j]){
                System.out.println("true");
                break;
            }
            n=n-1;
        }
       
    }
    
}
