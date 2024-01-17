/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content.of.directory;
import java.io.*;

/**
 *
 * @author Alex_
 */
public class ContentOfDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dir = new File ("C:\\Users\\Alex_\\Desktop\\New Folder");
        if (dir.isDirectory()){
            File [] files = dir.listFiles();
            for (File f : files ){
                System.out.println(f.getName());
            }
        }
    }
    
}
