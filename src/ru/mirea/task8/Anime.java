package ru.mirea.task8;
import javax.swing.*;

public class Anime {
    public static void main(String[] argc) {


        JFrame frame = new JFrame("PictureFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 768);
        frame.setVisible(true);

        ImageIcon imag1= new ImageIcon("C:\\123\\1.jpg");
        ImageIcon imag2= new ImageIcon("C:\\123\\2.jpg");
        JLabel label;
       // frame.add(label);

        while (true) {
            label = new JLabel (imag1);
            frame.add(label);
            frame.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            frame.getContentPane().removeAll();

            label = new JLabel (imag2);
            frame.add(label);
            frame.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            frame.getContentPane().removeAll();
        }
    }
}