/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.pkg2006.q2;

/**
 *
 * @author Alex_
 */
public class AP2006Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle item1 = new Vehicle (20000, 2000, 0.1);
    }
    
}
interface Item {
    double purchasePrice();
}

abstract class TaxableItem implements Item {
    private double taxRate;
    public abstract double getListPrice();
    public TaxableItem (double rate){
        taxRate = rate;
    }
    public double purchasePrice () {
        double price = this.getListPrice();
        double tax = this.getListPrice()*taxRate;
        return price + tax;
    }
    
}
class Vehicle extends TaxableItem {
    private double taxRate;
    private double dealerCost;
    private double dealerMarkup;
    public Vehicle (double cost, double Markup, double tax) {
        
        dealerCost = cost;
        dealerMarkup = Markup;
        taxRate = tax;
        
    }
    
    public double ListPrice () {
        return (dealerCost+dealerMarkup)*taxRate+(dealerCost+dealerMarkup);
    }
    
    public void changeMarkup (double Markup) {
        dealerMarkup = Markup;
    }
    
}