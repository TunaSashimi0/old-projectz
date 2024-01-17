/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding.tostring;

/**
 *
 * @author Alex_
 */
public class OverridingTostring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp=new Employee ("Martinez","Anthony");
        System.out.println(emp.toString());
    }
    
}
class Employee{
    private String lastName;
    private String firstName;
    public Employee (String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        
    }
    public String toString(){
        return "employee["+this.firstName+" "+this.lastName+"]";
    }
}
