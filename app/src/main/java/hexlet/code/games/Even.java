package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    static final int MAX_RND_NUMBER = 10;
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void isEvenGame() {

        String[][] qNaArr = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT - 1];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MAX_RND_NUMBER);

            String answer = isEven(number) ? "yes" : "no";

            qNaArr[i][0] = String.valueOf(number);
            qNaArr[i][1] = answer;
        }
        Engine.gameEngine(qNaArr, DESCRIPTION);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
