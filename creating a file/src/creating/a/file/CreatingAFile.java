/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creating.a.file;
import java.io.*;


/**
 *
 * @author Alex_
 */
public class CreatingAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       File f = new File ("C:\\Users\\Alex_\\Documents\\NetBeansProjects\\creating a file\\src\\creating\\a\\file\\Alex.txt");
       if (f.createNewFile()){
           System.out.println("file created");
       }
       else {
           System.out.println("file could not be created");
       }
       if (!f.exists()){
           System.out.println("The input file does not exist");
       }
    }
    
}
