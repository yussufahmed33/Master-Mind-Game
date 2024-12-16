package com.mycompany.mmgame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameService {

    private static MmGame game;
    private static List<Color> secretCode;
    public static final List<Color> colors = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE, Color.BLACK, Color.WHITE);

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
}
