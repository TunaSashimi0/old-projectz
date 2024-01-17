/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package write.in.a.text.file;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class WriteInATextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\movie.txt");
       PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter (f,true)));
       out.print("Alex");
       out.flush();
       out.close();
       
    }
    
}
