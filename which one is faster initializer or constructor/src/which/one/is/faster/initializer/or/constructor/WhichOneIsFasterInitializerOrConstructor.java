/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package which.one.is.faster.initializer.or.constructor;
import java.util.*;
/**
 *
 * @author Alex_
 */
public class WhichOneIsFasterInitializerOrConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrimeClass a=new PrimeClass();
    }
}
    class PrimeClass
    {
        private Scanner sc=new Scanner (System.in);
        public int x;
        {
            System.out.println("enter the start value for x: ");
            x=sc.nextInt();
        }
        public PrimeClass(){
            System.out.println("you're in constructor");
        }
    }
    

