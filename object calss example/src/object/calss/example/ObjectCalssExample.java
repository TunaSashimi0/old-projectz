/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.calss.example;

/**
 *
 * @author Alex_
 */
public class ObjectCalssExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle  circle1=new Circle();
        System.out.println(circle1.Area (10));
        Circle circle2=new Circle();
        System.out.println(circle2.Area (20));
    }
   
    
}
 class Circle{
        private double radius = 0.0;
        public Circle (){
            System.out.println("we are in construction");
        }
        public double Area(double r)
        {
            return 3.14*r*r;
        }
        public double getRadius(){//accessor method or getter method
            return radius;
        }
        public void setRadius (double rad){//mutator method 
            radius = rad;//the radius is set to rad
            
        }
    }