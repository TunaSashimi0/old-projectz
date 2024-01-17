/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball.pkgclass;

/**
 *
 * @author Alex_
 */
public class BallClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball b1 = new Ball();
        BouncingBall b2 = new BouncingBall();
        b2.Bouncing();

    }

}

class Ball {

    public Ball() {
        System.out.println("indside ball constuctor\n");
    }
}

class BouncingBall extends Ball {

    public BouncingBall() {
        System.out.println("inside bouncing ball constructor");
    }

    public void Bouncing() {
        System.out.println("*****inside bouncinging*****");
    }
}
class FootBall extends Ball{
    public FootBall(){
        System.out.println("Inside football constructor");
    }
}
