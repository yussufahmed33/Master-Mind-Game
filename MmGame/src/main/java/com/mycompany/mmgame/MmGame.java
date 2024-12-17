/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mmgame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

/**
 * @author yussuf ahmed
 */
public class MmGame {
static List<Color> selectedColors ;
    static int attempts = 10;
    static ImageIcon icon = new ImageIcon("C:\\Users\\yussuf ahmed\\Desktop\\Mastermind_Game_Icon.png");
    static ImageIcon backGround = new ImageIcon("C:\\Users\\yussuf ahmed\\Desktop\\40cdf1d44146da89389f5aeaef145cbe.jpg");
    static Image scaledIcon = icon.getImage().getScaledInstance(530, 700, Image.SCALE_SMOOTH);
    static GameService gameService = new GameService();

    public static void main(String[] args) {

        gameService.generateSecretCode();
        //////////////////////////////////////////////////
        JFrame frame = new JFrame("Master mind game");
        ImageIcon finalIcon = new ImageIcon(scaledIcon);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(null);
        frame.setIconImage(scaledIcon);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(finalIcon.getImage());
        frame.setResizable(true);
        /////////////////////////////////////////////////
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new FlowLayout());
        gamePanel.setBounds(0, 500, 530, 200);
        gamePanel.setBackground(Color.red);
        gamePanel.setForeground(Color.red);
        gamePanel.setOpaque(false);
        //////////////////////////////////////////////
        JLabel gameLabel = new JLabel();
        gameLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        gameLabel.setBackground(Color.blue);
        gameLabel.setForeground(Color.red);
        gameLabel.setIcon(backGround);
        /////////////////////////////////////////////
        JPanel attemptsPanel = new JPanel();
        attemptsPanel.setLayout(new FlowLayout());
        attemptsPanel.setBounds(0, 0, frame.getWidth(), 50);
        attemptsPanel.setBackground(Color.cyan);
        attemptsPanel.setForeground(Color.red);
        attemptsPanel.setOpaque(false);
        ////////////////////////////////////////////
        JLabel attemptsLabel = new JLabel("Attempts: " + attempts);
        attemptsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        attemptsLabel.setBounds(0, 0, attemptsPanel.getWidth(), attemptsPanel.getHeight());
        attemptsLabel.setBackground(Color.blue);
        attemptsLabel.setForeground(Color.red);
        ////////////////////////////////////////////
       // JPanel secretePanel1 = new JPanel();
        secretePanel1.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel1.setBounds(15, 150, 90, 50);
        secretePanel1.setBackground(Color.blue);
        secretePanel1.setForeground(Color.red);
        ////////////////////////////////////////////
       // JPanel secretePanel2 = new JPanel();
        secretePanel2.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel2.setBounds(110, 150, 90, 50);
        secretePanel2.setBackground(Color.blue);
        secretePanel2.setForeground(Color.red);
        ////////////////////////////////////////////
       // JPanel secretePanel3 = new JPanel();
        secretePanel3.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel3.setBounds(205, 150, 90, 50);
        secretePanel3.setBackground(Color.blue);
        secretePanel3.setForeground(Color.red);
        ////////////////////////////////////////////
        //JPanel secretePanel4 = new JPanel();
        secretePanel4.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel4.setBounds(300, 150, 90, 50);
        secretePanel4.setBackground(Color.blue);
        secretePanel4.setForeground(Color.red);
        ////////////////////////////////////////////
       // JPanel secretePanel5 = new JPanel();
        secretePanel5.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel5.setBounds(395, 150, 90, 50);
        ////////////////////////////////////////////
       // JButton button1 = new JButton("Color 1");
        attemptsPanel.setLayout(new FlowLayout());
        button1.setBounds(15, 5, 90, 50);
        button1.setBackground(gameService.colors.get(4));
        button1.setForeground(Color.MAGENTA);
        button1.setOpaque(true);
        button1.setFont(new Font("Arial", Font.BOLD, 16));
        ;
        //////////////////////////////////////////////
        //JButton button2 = new JButton("Color 2");
        button2.setBounds(110, 5, 90, 50);
        button2.setBackground(gameService.colors.get(4));
        button2.setForeground(Color.MAGENTA);
        button2.setOpaque(true);
        button2.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        //JButton button3 = new JButton("Color 3");
        button3.setBounds(205, 5, 90, 50);
        button3.setBackground(gameService.colors.get(4));
        button3.setForeground(Color.MAGENTA);
        button3.setOpaque(true);
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        //JButton button4 = new JButton("Color 4");
        button4.setBounds(300, 5, 90, 50);
        button4.setBackground(gameService.colors.get(4));
        button4.setForeground(Color.MAGENTA);
        button4.setOpaque(true);
        button4.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        //JButton button5 = new JButton("Color 5");
        button5.setBounds(395, 5, 90, 50);
        button5.setBackground(gameService.colors.get(4));
        button5.setForeground(Color.MAGENTA);
        button5.setOpaque(true);
        button5.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        JButton submit = new JButton("Submit");
        submit.setBounds(190, 70, 120, 50);
        submit.setBackground(Color.white);
        submit.setForeground(Color.DARK_GRAY);
        submit.setOpaque(true);
        submit.setFont(new Font("Arial", Font.BOLD, 20));
        //////////////////////////////////////////////
        JPanel pegsPanel = new JPanel();
        pegsPanel.setLayout(new FlowLayout());
        pegsPanel.setBounds(0, 400, frame.getWidth(), 50);
        pegsPanel.setBackground(Color.lightGray);
        pegsPanel.setOpaque(true);

        JLabel whitePegsLabel = new JLabel("White pegs: 0");
        whitePegsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        whitePegsLabel.setForeground(Color.BLACK);

        JLabel blackPegsLabel = new JLabel("Black pegs: 0");
        blackPegsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        blackPegsLabel.setForeground(Color.BLACK);
/////////////////////////////////////////////////
        gamePanel.add(button1);
        gamePanel.add(button2);
        gamePanel.add(button3);
        gamePanel.add(button4);
        gamePanel.add(button5);
        gamePanel.add(submit);
        frame.add(gamePanel);
        gamePanel.repaint();
        frame.add(attemptsPanel);
        attemptsPanel.add(attemptsLabel);
        attemptsPanel.setLayout(null);
        gamePanel.setLayout(null);
        gamePanel.add(gameLabel);
        gameLabel.repaint();
        frame.add(gameLabel);
        frame.add(secretePanel1);
        frame.add(secretePanel2);
        frame.add(secretePanel3);
        frame.add(secretePanel4);
        frame.add(secretePanel5);
        pegsPanel.add(whitePegsLabel);
        pegsPanel.add(blackPegsLabel);
        frame.add(pegsPanel);
//////////////////////////////////////////////////

        button1.addActionListener(new ActionListener() {
            int[] i = {0};

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] < gameService.colors.size()) {
                    System.out.println(gameService.colors.get(i[0]));

                    button1.setBackground(gameService.colors.get(i[0]));
                    i[0]++;
                }
                if (i[0] == 5) {
                    i[0] = 0;
                }

            }
        });
        button2.addActionListener(new ActionListener() {
            int[] i = {0};

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] < gameService.colors.size()) {
                    System.out.println(gameService.colors.get(i[0]));

                    button2.setBackground(gameService.colors.get(i[0]));
                    i[0]++;
                }
                if (i[0] == 5) {
                    i[0] = 0;
                }

            }
        });
        button3.addActionListener(new ActionListener() {
            int[] i = {0};

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] < gameService.colors.size()) {
                    System.out.println(gameService.colors.get(i[0]));

                    button3.setBackground(gameService.colors.get(i[0]));
                    i[0]++;
                }
                if (i[0] == 5) {
                    i[0] = 0;
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            int[] i = {0};

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] < gameService.colors.size()) {
                    System.out.println(gameService.colors.get(i[0]));
                    button4.setBackground(gameService.colors.get(i[0]));
                    i[0]++;
                }
                if (i[0] == 5) {
                    i[0] = 0;
                }

            }
        });
        button5.addActionListener(new ActionListener() {
            int[] i = {0};

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] < gameService.colors.size()) {
                    System.out.println(gameService.colors.get(i[0]));

                    button5.setBackground(gameService.colors.get(i[0]));
                    i[0]++;
                }
                if (i[0] == 5) {
                    i[0] = 0;

                }

            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(submit.getBounds());
              //  List<Color> selectedColors = Arrays.asList(button1.getBackground(), button2.getBackground(), button3.getBackground(), button4.getBackground(), button5.getBackground());
              selectedColors = Arrays.asList(button1.getBackground(), button2.getBackground(), button3.getBackground(), button4.getBackground(), button5.getBackground());
                System.out.println("selected colors: " + selectedColors);
                System.out.println("secrete code: " + gameService.getSecreteCode());
                int blackPegs = 0;
                int witePegs = 0;
                for (int i = 0; i < selectedColors.size(); i++) {
                    if (selectedColors.get(i).equals(gameService.getSecreteCode().get(i))) {
                        blackPegs++;
                    }
                    if (!selectedColors.get(i).equals(gameService.getSecreteCode().get(i))) {
                        witePegs++;
                    }
                }
                whitePegsLabel.setText("White pegs: " + witePegs);
                blackPegsLabel.setText("Black pegs: " + blackPegs);
                System.out.println(whitePegsLabel.getText());
                System.out.println(blackPegsLabel.getText());
                if (selectedColors.equals(gameService.getSecreteCode())) {
                    JOptionPane.showMessageDialog(frame, "Code breaker wins!", "You Win", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    attempts--;
                    if (attempts == 0) {
                        List<Color> copySecreteCode = gameService.getSecreteCode();
                        secretePanel1.setBackground(copySecreteCode.get(0));
                        secretePanel2.setBackground(copySecreteCode.get(1));
                        secretePanel3.setBackground(copySecreteCode.get(2));
                        secretePanel4.setBackground(copySecreteCode.get(3));
                        secretePanel5.setBackground(copySecreteCode.get(4));

                        JOptionPane.showMessageDialog(frame, "Code maker wins! You ran out of attempts.", "You Lose", JOptionPane.INFORMATION_MESSAGE);
                        attempts = 10;
                        button1.setBackground(gameService.colors.get(4));
                        button2.setBackground(gameService.colors.get(4));
                        button3.setBackground(gameService.colors.get(4));
                        button4.setBackground(gameService.colors.get(4));
                        button5.setBackground(gameService.colors.get(4));
                        System.exit(0);
                    }
                    attemptsLabel.setText("Attempts: " + attempts);
                }

            }
        });

    }
    static JButton button1 = new JButton("Color 1");
    static JButton button2 = new JButton("Color 1");
    static JButton button3 = new JButton("Color 1");
    static JButton button4 = new JButton("Color 1");
    static JButton button5 = new JButton("Color 1");
   // static List<Color> selectedColors = Arrays.asList(button1.getBackground(), button2.getBackground(), button3.getBackground(), button4.getBackground(), button5.getBackground());
    //static List<Color> copySelectedColors = Arrays.asList(sel);
    static JPanel secretePanel1 = new JPanel();
    static JPanel secretePanel2 = new JPanel();
    static JPanel secretePanel3 = new JPanel();
    static JPanel secretePanel4 = new JPanel();
    static JPanel secretePanel5 = new JPanel();
}
