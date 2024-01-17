/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding.example;

/**
 *
 * @author Alex_
 */
public class OverridingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal a = new Animal();
       Animal b=new Dog();
       Animal c=new Cat();
       a.move();
       b.move();
       c.move();
    }
    
}
class Animal{
    public void move(){
        System.out.println("animals can move");
        
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}
class Cat extends Animal{
    public void move (){
        System.out.println("cat's can walk and run");
    }
}