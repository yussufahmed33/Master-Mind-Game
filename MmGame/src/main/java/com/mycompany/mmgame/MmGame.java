/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mmgame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.swing.*;

/**
 * @author yussuf ahmed
 */
public class MmGame {
    static List<Color> selectedColors ;
    static int attempts = 10;
static ImageIcon backGround = new ImageIcon(Objects.requireNonNull(MmGame.class.getResource("/backGround.jpeg")));
static ImageIcon icon = new ImageIcon(Objects.requireNonNull(MmGame.class.getResource("/Mastermind_Game_Icon.png")));
    static ImageIcon winIcon = new ImageIcon(Objects.requireNonNull(MmGame.class.getResource("/winMessage.webp")));
    static ImageIcon looseIcon = new ImageIcon(Objects.requireNonNull(MmGame.class.getResource("/looseMessage.webp")));
    static Image scaledImage = icon.getImage().getScaledInstance(530, 700, Image.SCALE_SMOOTH);
    static Image scaledBack = backGround.getImage().getScaledInstance(530, 700, Image.SCALE_SMOOTH);
    static ImageIcon finalIcon = new ImageIcon(scaledImage);
    static ImageIcon finalBack = new ImageIcon(scaledBack);
    static GameService gameService = new GameService();

    public static void main(String[] args) {

        gameService.generateSecretCode();
        //////////////////////////////////////////////////
        JFrame frame = new JFrame("Master mind game");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(null);
        frame.setIconImage(finalIcon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
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
        gameLabel.setIcon(finalBack);
        /////////////////////////////////////////////
        JPanel attemptsPanel = new JPanel();
        attemptsPanel.setLayout(new FlowLayout());
        attemptsPanel.setBounds(0, 0, frame.getWidth(), 50);
        attemptsPanel.setBackground(Color.cyan);
        attemptsPanel.setForeground(Color.red);
        attemptsPanel.setOpaque(false);
        ////////////////////////////////////////////
        attemptsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        attemptsLabel.setBounds(0, 0, attemptsPanel.getWidth(), attemptsPanel.getHeight());
        attemptsLabel.setBackground(Color.blue);
        attemptsLabel.setForeground(Color.red);
        ////////////////////////////////////////////
        secretePanel1.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel1.setBounds(15, 150, 90, 50);
        ////////////////////////////////////////////
        secretePanel2.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel2.setBounds(110, 150, 90, 50);
        ////////////////////////////////////////////
        secretePanel3.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel3.setBounds(205, 150, 90, 50);
        ////////////////////////////////////////////
        secretePanel4.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel4.setBounds(300, 150, 90, 50);
        ////////////////////////////////////////////
        secretePanel5.setFont(new Font("Arial", Font.BOLD, 20));
        secretePanel5.setBounds(395, 150, 90, 50);
        ////////////////////////////////////////////
        attemptsPanel.setLayout(new FlowLayout());
        button1.setBounds(15, 5, 90, 50);
        button1.setBackground(gameService.colors.get(0));
        button1.setForeground(Color.MAGENTA);
        button1.setOpaque(true);
        button1.setFont(new Font("Arial", Font.BOLD, 16));
        //////////////////////////////////////////////
        button2.setBounds(110, 5, 90, 50);
        button2.setBackground(gameService.colors.get(0));
        button2.setForeground(Color.MAGENTA);
        button2.setOpaque(true);
        button2.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        button3.setBounds(205, 5, 90, 50);
        button3.setBackground(gameService.colors.get(0));
        button3.setForeground(Color.MAGENTA);
        button3.setOpaque(true);
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        button4.setBounds(300, 5, 90, 50);
        button4.setBackground(gameService.colors.get(0));
        button4.setForeground(Color.MAGENTA);
        button4.setOpaque(true);
        button4.setFont(new Font("Arial", Font.BOLD, 16));
        ////////////////////////////////////////////////////
        button5.setBounds(395, 5, 90, 50);
        button5.setBackground(gameService.colors.get(0));
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
        whitePegsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        whitePegsLabel.setForeground(Color.BLACK);
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
                gameService.buttonColors(i);
                button1.setBackground(gameService.colors.get(i[0]));
            }
        });
        button2.addActionListener(new ActionListener() {
            int[] i = {0};
            @Override
            public void actionPerformed(ActionEvent e) {
                gameService.buttonColors(i);
                button2.setBackground(gameService.colors.get(i[0]));
            }
        });
        button3.addActionListener(new ActionListener() {
            int[] i = {0};
            @Override
            public void actionPerformed(ActionEvent e) {
                gameService.buttonColors(i);
                button3.setBackground(gameService.colors.get(i[0]));
            }
        });
        button4.addActionListener(new ActionListener() {
            int[] i = {0};
            @Override
            public void actionPerformed(ActionEvent e) {
                gameService.buttonColors(i);
                button4.setBackground(gameService.colors.get(i[0]));
            }
        });
        button5.addActionListener(new ActionListener() {
            int[] i = {0};
            @Override
            public void actionPerformed(ActionEvent e) {
                gameService.buttonColors(i);
                button5.setBackground(gameService.colors.get(i[0]));
            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempts--;
              selectedColors = Arrays.asList(button1.getBackground(), button2.getBackground(), button3.getBackground(), button4.getBackground(), button5.getBackground());
                System.out.println("secrete code: " + gameService.getSecreteCode());
                gameService.pegsCounter();
if(gameService.winChecker()==true){
    int response = JOptionPane.showConfirmDialog(frame, "You win! Do you want to restart the game?", "Game Over", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,winIcon);

    if (response == JOptionPane.YES_OPTION) {
        gameService.restartGame();
    } else {
        System.exit(0);
    }
}
                else if(gameService.winChecker()==false && attempts==0){
                    attempts=10;
    int response = JOptionPane.showConfirmDialog(frame, "You loose! Do you want to restart the game?", "Game Over", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,winIcon);
    if (response == JOptionPane.YES_OPTION) {
        gameService.restartGame();
    } else {
        System.exit(0);
    }
                }

            }
        });

    }
    static JButton button1 = new JButton("Color 1");
    static JButton button2 = new JButton("Color 2");
    static JButton button3 = new JButton("Color 3");
    static JButton button4 = new JButton("Color 4");
    static JButton button5 = new JButton("Color 5");
    static JPanel secretePanel1 = new JPanel();
    static JPanel secretePanel2 = new JPanel();
    static JPanel secretePanel3 = new JPanel();
    static JPanel secretePanel4 = new JPanel();
    static JPanel secretePanel5 = new JPanel();
    static JLabel attemptsLabel = new JLabel("Attempts: 10" );
    static JLabel whitePegsLabel = new JLabel("White pegs: 0");
    static JLabel blackPegsLabel = new JLabel("Black pegs: 0");

}
