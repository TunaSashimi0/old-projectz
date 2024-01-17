/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular.expression;
import java.util.regex.*;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public final class RegularExpression {
    
    static String r,s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    private static Scanner sc = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println ("Welcome to the Regex Tester\n");
      do {
          do{
              System.out.println("\nEnter regex:    ");
              r=sc.nextLine();
              validRegex=true;
              try {
                  pattern = Pattern.compile(r);
              }
              catch (Exception e){
                  System.out.println(e.getMessage());
                  validRegex = false;
          }
              
      }
          while (!validRegex);
          doneMatching = false;
          while (!doneMatching){
              System.out.print("Enter string: ");
              s = sc.nextLine();
              if (s.length () == 0){
                  doneMatching = true;
              }
              else {
                  matcher = pattern.matcher(s);
                  if (matcher.matches())
                      System.out.println("Match.");
                  else 
                      System.out.println(
                      "Does not match.");
              }
          }
       }while (askAgain());
    }
       
private static boolean askAgain() {
    System.out.print("Another? (Y or N)");
    String reply = sc.nextLine();
    if (reply.equalsIgnoreCase ("Y"))
        return true;
    return false;
}
     
}
    
  /*Enter regex:    
[^cf]at
Enter string: bat
Match.
Enter string: cat
Does not match.
Enter string: fat
Does not match.
Enter string: */  

