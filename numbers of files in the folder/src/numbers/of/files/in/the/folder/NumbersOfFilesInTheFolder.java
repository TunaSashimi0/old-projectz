/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers.of.files.in.the.folder;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class NumbersOfFilesInTheFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numbers = 0;
       File dir = new File ("C:\\Users\\Alex_\\Desktop\\New Folder");
        if (dir.isDirectory()){
            File [] files = dir.listFiles();
            for (File f : files ){
                numbers+=1;
            }
            System.out.println(numbers);
    }
        
      File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder");
      int count = 0;
      for (File file : f.listFiles()){
          if (file.isFile()){
              count++;
          }
      }
        System.out.println("number of files: "+count);
    
}
}
