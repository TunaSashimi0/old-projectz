/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleting.a.file;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class DeletingAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\newfiles200.txt");
        if (f.delete()){
            System.out.println("file deleted");
        }
        else {
            System.out.println("file not deleted");
        }
    }
    
}
