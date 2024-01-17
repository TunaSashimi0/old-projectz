/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffer.reader;
import java.io.*;
/**
 *
 * @author Alex_
 */
public class BufferReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       File f = new File ("C:\\Users\\Alex_\\Desktop\\New Folder\\movie.txt");
       BufferedReader in = new BufferedReader (new FileReader (f));
       String line = in.readLine();
       while (line != null ){
           System.out.println(line);
           line = in.readLine();
       }
       
    }
    
}
