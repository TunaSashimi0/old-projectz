/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader.pkgclass.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

/**
 *
 * @author Alex_
 */
public class BufferedReaderClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
      String name;
      int hours;
      double rate,pay;
        System.out.println("enter your name: ");
        name = in.readLine();
        System.out.println("enter the number of hours worked");
        hours = Integer.parseInt(in.readLine());
        System.out.println("enter pay rate per hour: ");
        rate = Double.parseDouble(in.readLine());
        System.out.println();
        pay = hours*rate;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println(name+", your pay is: "+fmt.format(pay));
    }
    
}
