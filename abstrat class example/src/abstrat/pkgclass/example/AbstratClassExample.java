/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrat.pkgclass.example;

/**
 *
 * @author Alex_
 */
public class AbstratClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       example4 obj = new example4();
       obj.display3();
    }
    
}
class example1 {
    public void display1(){
        System.out.println("display 1 method");
    }
}
abstract class example2{
    public void display2(){
        System.out.println("display 2 method");
    }
}
abstract class example3 extends example1{
    abstract void display3 ();
}
class example4 extends example3{
    public void display3(){
        System.out.println("display 3 method");
    }
}
class Demo{
    public static void main (String args[]){
        example4 obj=new example4();
        obj.display3();
    }
}
