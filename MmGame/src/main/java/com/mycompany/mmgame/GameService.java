package com.mycompany.mmgame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameService {
    private static MmGame game = new MmGame();
    private static List<Color> secretCode;
    public static final List<Color> colors = Arrays.asList(Color.WHITE, Color.RED, Color.GREEN, Color.BLUE, Color.BLACK);

    public static void generateSecretCode() {
        Random r = new Random();
        secretCode = new ArrayList<>();
        for (int i = 0; i < colors.size(); i++) {
            int random = r.nextInt(0, 5);
            if (!secretCode.contains(colors.get(random))) {
                secretCode.add(i, colors.get(random));
            } else {
                i--;
            }
        }
        System.out.println(secretCode);
    }

    public List<Color> getSecreteCode() {
        return secretCode;
    }
public boolean winChecker(){
        if(game.selectedColors.equals(getSecreteCode())){
            return true;
        }
             if(!game.selectedColors.equals(getSecreteCode()) && game.attempts==0){
             game.button1.setBackground(colors.get(0));
             game.button2.setBackground(colors.get(0));
             game.button3.setBackground(colors.get(0));
             game.button4.setBackground(colors.get(0));
             game.button5.setBackground(colors.get(0));
            game.secretePanel1.setBackground(getSecreteCode().get(0));
            game.secretePanel2.setBackground(getSecreteCode().get(1));
            game.secretePanel3.setBackground(getSecreteCode().get(2));
            game.secretePanel4.setBackground(getSecreteCode().get(3));
            game.secretePanel5.setBackground(getSecreteCode().get(4));
                 return false;
        }
    return false;
}
public void pegsCounter(){
    int blackPegs=0;
    int witePegs = 0;
    for (int i = 0; i < game.selectedColors.size(); i++) {
        if (game.selectedColors.get(i).equals(getSecreteCode().get(i))) {
            blackPegs++;
        }
        if (!game.selectedColors.get(i).equals(getSecreteCode().get(i))) {
            witePegs++;
        }
    }
    game.attemptsLabel.setText("Attempts: "+game.attempts);
    game.whitePegsLabel.setText("White pegs: " + witePegs);
    game.blackPegsLabel.setText("Black pegs: " + blackPegs);
}
public void buttonColors(int[] i){
    if (i[0] < colors.size()) {
        i[0]++;
        if (i[0] == 5) {
            i[0] = 0;
        }
    }
}
    public void restartGame() {
        game.attempts = 10;
        game.button1.setBackground(colors.get(0));
        game.button2.setBackground(colors.get(0));
        game.button3.setBackground(colors.get(0));
        game.button4.setBackground(colors.get(0));
        game.button5.setBackground(colors.get(0));
        generateSecretCode();
    }
    }



