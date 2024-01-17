/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guest.invit;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class GuestInvit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int numberOfGuests = input.nextInt();
       int roundsOfRemoval = input.nextInt();
       int[] guests = new int [numberOfGuests];
        for (int i = 0; i < guests.length; i++) {
            guests [i] = i+1;
            
        }
        for (int i = 0; i < roundsOfRemoval; i++) {
            int removalFactor = input.nextInt();
            int counter = 0;
            for (int j = 0; j < guests.length; j++) {
                if(guests[j]!=-1){
                    counter++;
                }
                if (counter % removalFactor == 0){
                    guests[j] = -1;
                }
            }
        }
        for (int i = 0; i < guests.length; i++) {
            if(guests[i] != -1){
                System.out.println(guests[i]);
            }
        }
    }
    
}
