/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.and.objects.constructors;

/**
 *
 * @author Alex_
 */
public class ClassAndObjectsConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor a=new Actor("Arnold","Schwarenegger");
        Actor b=new Actor("lol","jkjk",true);
        }
        
        
    }
    class Actor{
            private String Firstname;
            private String Lastname;
            private boolean goodActor;
            public Actor (String first, String last){
                Firstname=first;
                Lastname=last;
                System.out.println("constructor with two parameters, firstname is: " +Firstname+"lastname is "+Lastname);
            }
            public Actor (String first, String last, boolean b){
                Firstname=first;
                Lastname=last;
                goodActor=b;
                System.out.println("constructor with threee parameters, firstname is: "+Firstname+"Lastname is: "+Lastname+"performance is "+b);
            }
}
