/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.pkgenum.example;

/**
 *
 * @author Alex_
 */
public class StringEnumExample {
public enum TextStyle {
    BOLD, ITALICS, UNDERLINE, STRIKETROUGH;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String style = "bold";
        TextStyle textstyle = TextStyle.valueOf(style.toUpperCase());
        System.out.println(textstyle);
    }
    
}
