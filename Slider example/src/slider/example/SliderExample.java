package slider.example;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderExample extends JFrame {

    JSlider slide = new JSlider(0, 50, 0);

    public SliderExample() {
        this.setSize(320, 200);
        this.setTitle("Sliding");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel c = new JLabel ();
        JLabel f = new JLabel ();
        JPanel panel1 = new JPanel();
        slide.setMajorTickSpacing(10);
        slide.setMinorTickSpacing(1);
        slide.setPaintTicks(true);
        slide.addChangeListener(e -> SliderListener());
        slide.setPaintLabels(true);
        panel1.add(slide);
        this.add(panel1);
        this.setVisible(true);
    }

    public void SliderListener() {
        if (slide.getValue() == 40) {
            JOptionPane.showMessageDialog(null, "No! Not 40!", "The Machine", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SliderExample();
    }

    void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
