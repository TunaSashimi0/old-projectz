/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsuper.example;

/**
 *
 * @author Alex_
 */
public class SuperExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseBall b1=new BaseBall();
    }

}

class Ball {

    private double weight;

    public Ball(double weight) {
        this.weight = weight;
        System.out.println(weight);
    }

}

class BaseBall extends Ball {

    public BaseBall() {
        super(5.125);
        System.out.println();
    }
}
