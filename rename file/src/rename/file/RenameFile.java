/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rename.file;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class RenameFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles1.txt");
       if (f.renameTo(new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles200.txt"))){
           System.out.println("file renamed");
       }
        
       else {
           System.out.println("file could not be renamed");
       }
    }
    
}
