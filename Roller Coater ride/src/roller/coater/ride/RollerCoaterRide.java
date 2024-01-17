/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roller.coater.ride;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class RollerCoaterRide {
    
    private static String print;
    
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = sc.nextInt ();
        for (int j = 0; j < i; j++) {
            findCombinations(sc.nextInt());
        }
        System.out.println(print);
    }
    
      
  static void findCombinations(int arr[], int index, int num, int reducedNum) 
{ 
    int counter = 0;
    if (reducedNum < 0) 
        return; 
  
    if (reducedNum == 0) 
    {      
            counter+=1;
            System.out.println(counter);
        return; 
    } 
 
    int prev = (index == 0) ?  
                          1 : arr[index - 1]; 
  
   
    for (int k = prev; k <= num ; k++) 
    { 
       
        arr[index] = k; 
  
       
        findCombinations(arr, index + 1, num, 
                                 reducedNum - k); 
    }
    
} 
  

static void findCombinations(int n) 
{ 
    int arr[] = new int [n]; 
    findCombinations(arr, 0, n, n); 
}
    
}
