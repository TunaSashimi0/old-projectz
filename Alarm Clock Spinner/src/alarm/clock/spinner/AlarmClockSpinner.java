/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm.clock.spinner;

/**
 *
 * @author User
 */
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AlarmClockSpinner extends JFrame implements ActionListener, Runnable {

    /**
     * @param args the command line arguments
     */
    public JButton OKButton;
    JSpinner hours1;
    JSpinner minutes1;
    JSpinner seconds1;
    JSpinner ampm;
    JLabel label1, label2;

    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    int hoursa = 0, minutesa = 0, secondsa = 0;
    String timeString = "";
    JLabel b;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Calendar cal;

    public static void main(String[] args) {
        // TODO code application logic here
        new AlarmClockSpinner();
    }

    AlarmClockSpinner() {

        t = new Thread(this);
        t.start();

        b = new JLabel();
        b.setBounds(60, 10, 60, 50);
        b.setBorder(BorderFactory.createSoftBevelBorder(WIDTH, Color.lightGray, Color.lightGray));

        OKButton = new JButton("Set Alarm");
        OKButton.addActionListener(this);

        JPanel panel1 = new JPanel();
        label1 = new JLabel();

        ImageIcon icon = new ImageIcon("C:\\Users\\Alex_\\Documents\\NetBeansProjects\\Alarm Clock Spinner\\src\\alarm\\clock\\spinner\\VC2.png");
        label2 = new JLabel(icon);

        hours1 = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        minutes1 = new JSpinner(new SpinnerNumberModel(1, 0, 59, 1));
        seconds1 = new JSpinner(new SpinnerNumberModel(1, 0, 59, 1));
        String[] ampmString = {"am", "pm"};
        ampm = new JSpinner(new SpinnerListModel(ampmString));

        panel1.add(OKButton);

        panel1.add(hours1);
        panel1.add(minutes1);
        panel1.add(seconds1);
        panel1.add(ampm);
        panel1.add(b);
        panel1.add(label1);
        panel1.add(label2);

        this.add(panel1);
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == OKButton) {
            hoursa = (int) hours1.getValue();
            minutesa = (int) minutes1.getValue();
            secondsa = (int) seconds1.getValue();
            String ampm1 = (String) ampm.getValue();

            label1.setText("You set this alarm = Hour: " + hoursa + " minutes " + minutesa + " seconds " + secondsa + " : " + ampm1);

        }

    }

    public void run() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\Alex_\\Documents\\NetBeansProjects\\Alarm Clock Spinner\\src\\alarm\\clock\\spinner\\c12.wav")));

            while (true) {

                cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) {
                    hours -= 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();
                if ((hours == hoursa) && (minutes == minutesa)) {
                    //tk.beep();
                    clip.start();

                }
                t.sleep(1000);  // interval given in milliseconds 

            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        b.setText(timeString);
    }

}
