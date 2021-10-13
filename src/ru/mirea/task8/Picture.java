package ru.mirea.task8;
import javax.swing.*;

public class Picture {
    public static void main(String[] argc) {


        JFrame frame = new JFrame("PictureFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 768);

        ImageIcon imag= new ImageIcon(argc[0]);
        JLabel label = new JLabel(imag);
        frame.add(label);
        //java C:\Users\IVC1-5\IdeaProjects\JavaFirstMirea\src\ru\mirea\task8\Picture.java C:\123.jpg
        ;
        frame.setVisible(true);


    }
}