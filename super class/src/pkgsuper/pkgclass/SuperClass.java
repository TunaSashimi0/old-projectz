/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsuper.pkgclass;

/**
 *
 * @author Alex_
 */
class Animal{
    public void move (){
        System.out.println("animals can move");
    }
}
class Dog extends Animal {
public void move(){
    super.move();
    System.out.println("dogs can walk and run");
}
}
public class SuperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal b=new Dog ();
      b.move();
    }
    
}
