/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import javax.swing.JSlider;

/**
 *
 * @author Alex_
 */
public class Slider extends {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        new Sliders ();
        
        JSlider slider = new JSlider (0,50,0);
        slider.setMajorTickSpacing (10);
        slider.setMinorTickSpacing(1);
        slider.setPainTicks(true);
        slider.setPaintLabels(true);
        pane1.add(slider)
    }
    
    public Slider (){
        
    }
    
}
