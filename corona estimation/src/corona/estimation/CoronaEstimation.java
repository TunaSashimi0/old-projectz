/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona.estimation;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class CoronaEstimation {
    static Scanner sc = new Scanner(System.in);
    public int r0 = 2+ (int)(Math.random()*3);
    public int day = 0;
    public int quarantined = 0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the total amount of population");
        int initial = sc.nextInt();
        System.out.println("enter the initial amount of infected");
        int infected = sc.nextInt();
        virus covid = new virus (initial, infected);
    }
    
   
    
    
}

class virus {
    
    static Scanner sc = new Scanner(System.in);
    public int day = 0;
    public double dailyinfected;
    public double infected2;
    public double totalinfected = 0;
    
    public double quarantined = 0;
    
    
    public virus (int initial, int infected){
        
        spread (initial, infected);
        
    }
    
    
    public void spread (double initial , double infected) {
        
        int r0 = 0;
        infected2 = infected;
        
        while (true){
            r0 = 2+(int)(Math.random()*2); // the r0 scale of the virus 
            infected2 = infected2 + infected2 * r0;
            
            dailyinfected = infected2/14;
            
            day +=1;
            totalinfected = dailyinfected + infected;
            System.out.println("Day: "+day+"\n"+"Infected: "+ totalinfected+"\n"+"quarantined: "+quarantined+"\n"+"*******************************"+"\n");
            
            
            if (day%14==0){
                
                quarantined = quarantined + infected;
            }
            
            
        }
        
    }
    
    
}







