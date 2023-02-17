package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int ROUNDS_COUNT = 3;

    public static void isEvenGame() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questionsArr = new String[ROUNDS_COUNT];
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            int rnd = new Random().nextInt(10);
            questionsArr[j] = String.valueOf(rnd);
        }

        String[] answersArr = new String[ROUNDS_COUNT];
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            if (Integer.parseInt(questionsArr[j]) % 2 == 0) {
                answersArr[j] = "yes";
            } else {
                answersArr[j] = "no";
            }
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }
}
