/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface.example;

/**
 *
 * @author Alex_
 */
public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       example4 obj = new example4();
       obj.display1();
    }

}

interface example1 {

    public void display1();
}

interface example2 {

    public void display2();
}

interface example3 extends example1, example2 {

}

class example4 implements example3 {

    public void display1() {
        System.out.println("display2 method");
    }

    public void display2() {
        System.out.println("display3 method");
    }
}

class Demo {

    public static void main(String arg[]) {
        example4 obj = new example4();
        obj.display1();
    }
}
