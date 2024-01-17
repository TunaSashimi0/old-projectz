/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000.files.and.delete;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class FilesAndDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         for (int i = 0; i < 1000; i++) {
            File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles"+i+".txt");
        if (f.createNewFile()){
           System.out.println("file created");
       }
            else {
           System.out.println("file could not be created");
       }
    }
        
     for (int i = 0; i < 1000; i++) {
            File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles"+i+".txt");
        if (f.delete()){
            System.out.println("file deleted");
        }
        else {
            System.out.println("file not deleted");
        }
        }
}
    
}

