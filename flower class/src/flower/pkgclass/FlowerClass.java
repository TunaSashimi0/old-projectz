/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flower.pkgclass;

/**
 *
 * @author Alex_
 */
class Flower{
    int n=0;
    public Flower(){
        System.out.println("inside flower constructor");
        System.out.println(n);
    }
    public double numb (int n){
        n = this.n+1;
        return n;
    }
    public void superclass(){
        System.out.println("super class");
    }
    
}
class rose extends Flower{
    
    public void health (){
        super.superclass();
        System.out.println("flowers are healthy");
        
    }
    public void number (int n){
        n=1;
        System.out.println(n);
    }
    
    
}
class lily extends Flower {
    public void health(){
        
        System.out.println("flower are healthy");
        
    }
    public void number (String s){
        s="this is numebr";
        System.out.println(s);
    }
   
}
class sunflower extends Flower{
    
    public void health (){
        System.out.println("flower are healthy");
       
    }
    public void number (int n, int a){
        n=1;
        a=2;
        n+=a;
        System.out.println(n);
    }
}

public class FlowerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Flower rose=new rose();
       Flower lily=new lily();
       Flower sunflower=new sunflower();
    }
    
}
