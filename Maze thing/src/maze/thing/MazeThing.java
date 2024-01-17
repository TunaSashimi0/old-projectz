/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze.thing;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class MazeThing {
    static Scanner sc = new Scanner(System.in);
    static int m = sc.nextInt ();
    static int n = sc.nextInt ();
    static int maze [][] = new int [m][n];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0;i<m;i++){
            for (int j= 0; j< n;j++){
                maze [i][j]=sc.nextInt();
            }
        }
        System.out.println("done user input");
        int dx[] = new int [] {0,1,0,-1};
        int dy[] = new int [] {1,0,-1,0};
        
       
       int counter = 0;
       int x = 0;
       int y = n;
       while (counter>-1){
           for (int i = 0; i<4 ;i++){
               int xx = x + dx [i];
               int yy = y+dx[i];
               if (x>0&&y>0&&maze [x][y]==1){
                   if (one (xx,yy)== true){
                       counter ++;
                       x=xx;
                       y=yy;
                   }
               }
               if (x>0&&y>0&&maze [x][y]==0){
                   if  (zero (xx,yy)== true){
                       counter ++;
                       x=xx;
                       y=yy;
                   }
               }
           }
           
       }
        System.out.println(counter);
       
       
    }
    
    public static boolean one (int a, int b){
        if (maze [a][b]==0)
            return true; 
        else 
            return false;
    }
    
    public static boolean zero (int a, int b) {
        if (maze [a][b] ==1)
            return true;
        else 
            return false;
    }
    
}
