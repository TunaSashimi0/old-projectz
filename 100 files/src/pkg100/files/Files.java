/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100.files;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles"+i+".txt");
            if (f.createNewFile()){
           System.out.println("file created");
       }
       else {
           System.out.println("file could not be created");
       }
        }
        
    }
    
}
