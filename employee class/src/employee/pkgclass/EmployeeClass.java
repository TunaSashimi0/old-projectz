/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.pkgclass;

/**
 *
 * @author Alex_
 */
class person {
    public person(){
        System.out.println("we are human");
}
    public void personname(){
        String name="name";
        System.out.println(name);
    }
    
}
class customer extends person{
    
    public void personname (){
        super.personname();
    }
    
    public String personaddress(){
        String address = "Address";
                return address;
    }
    public int people (double i){
        i=100;
        return (int)i;
    }
}
class employee extends person{
    public int people (int i){
        i = 100;
        return i;
    }
}
class fulltime extends employee{
    public double salary (){
        double money = 0;
        return money;
    }
}
class parttime extends employee{
    public double wage(){
    double money = 0;
    return money;
    }
}
public class EmployeeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
