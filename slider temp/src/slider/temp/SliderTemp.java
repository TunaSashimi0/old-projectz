/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider.temp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderTemp  extends JFrame{


 
//public class CelsiusToFahrenheit {
 
  public static void main(String[] arguments) {
      new SliderTemp();
  }
  public SliderTemp(){
 
    this.setDefaultLookAndFeelDecorated(true);
    this.setTitle("Slider");
    this.setSize(400,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    JPanel container = new JPanel();
    container.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
    container.setLayout(new GridLayout(3, 1));
 
    JPanel results = new JPanel();
    results.setLayout(new FlowLayout());
 
    JLabel cLabel = new JLabel("Celsius: ");
    final JTextField cText = new JTextField(5);
 
    JLabel fLabel = new JLabel("Fahrenheit: ");
    final JTextField fText = new JTextField(5);
    results.add(cLabel);
    results.add(cText);
    results.add(fLabel);
    results.add(fText);
 
 
    JLabel sLabel = new JLabel("Celsius Slider",JLabel.CENTER);
    final JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,10);
    slider.setMinorTickSpacing(5);  
    slider.setMajorTickSpacing(20);  
    slider.setPaintTicks(true);  
    slider.setPaintLabels(true);  
 
 
    slider.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        int c = slider.getValue();
        fText.setText("" + (c * (double) 9 / 5 + 32) );
        cText.setText("" + c);
      }
    });
 
    // set default value
    fText.setText("" + (slider.getValue() * (double) 9 / 5 + 32) );
    cText.setText("" + slider.getValue());
 
    container.add(sLabel);
    container.add(slider);
    container.add(results);
 
    this.add(container);
    this.setVisible(true);
 
  }
}
