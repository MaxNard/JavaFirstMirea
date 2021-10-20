package ru.mirea.task9;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.util.Scanner;
import javax.swing.*;

public class Match {
    private int team1 = 0;
    private int team2 = 0;
    private JLabel labelTeams = new JLabel("Result: Милан "+team1+" X "+team2+" Мадрид");
    private JLabel labelLast = new JLabel();
    private JLabel labelWin = new JLabel();
    private JButton button1;
    private JButton button2;

    public void createGUI(){
        JFrame frame = new JFrame("Match Score");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button1 = new JButton("Милан");
        button2 = new JButton("Мадрид");
        panel.add(button1);
        panel.add(button2);

        labelTeams.setFont(new Font("Arial", Font.PLAIN, 28));
        labelLast.setFont(new Font("Arial", Font.PLAIN, 28));
        labelWin.setFont(new Font("Arial", Font.PLAIN, 28));
        panel.add(labelTeams);
        panel.add(labelLast);
        panel.add(labelWin);
        ActionListener actList1 = new pressActListOne();
        ActionListener actList2 = new pressActListTwo();

        button1.addActionListener(actList1);
        button2.addActionListener(actList2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

     class pressActListOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team1++;
            labelTeams.setText("Result: Милан "+team1+" X "+team2+" Мадрид");
            labelLast.setText("Last Scorer: Милан");
            if (team1 == 11)
            {
                labelWin.setText("Winner: Милан");
                button1.hide();
                button2.hide();
            }
        }
    }

    class pressActListTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team2++;
            labelTeams.setText("Result: Милан "+team1+" X "+team2+" Мадрид");
            labelLast.setText("Last Scorer: Мадрид");
            if (team2 == 11)
            {
                labelWin.setText("Winner: Мадрид");
                button1.hide();
                button2.hide();
            }
        }
    }
    public static void main(String[] args) {
        Match app = new Match();
        app.createGUI();
    }
}
