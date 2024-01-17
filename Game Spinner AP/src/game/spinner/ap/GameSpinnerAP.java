/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.spinner.ap;

/**
 *
 * @author Alex_
 */
public class GameSpinnerAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GameSpinner g = new GameSpinner (4);
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println("current run: "+g.currentRun());
    }
    
}

class GameSpinner {
    private int current = 0;
    private int sectors;
    private int temp;
    public GameSpinner (int input) {
        sectors = input;
    }
    public int spin () {
        
        int returnValv = 1 + (int)(Math.random() * sectors);
        if (temp == returnValv){
            current+=1;
            temp = returnValv;
        }
        else{
            current = 1;
            temp = returnValv;
        }
        return returnValv;
    }
    public int currentRun () {
        return current;
    }
}
