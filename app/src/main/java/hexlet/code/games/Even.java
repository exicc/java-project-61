package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    static final int MAX_RND_NUMBER = 10;
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void isEvenGame() {

        String[] questionsArr = new String[Engine.ROUNDS_COUNT];
        String[] answersArr = new String[Engine.ROUNDS_COUNT];
        for (int j = 0; j < Engine.ROUNDS_COUNT; j++) {
            int rnd = Utils.generateNumber(MAX_RND_NUMBER);
            questionsArr[j] = String.valueOf(rnd);

            int number = Integer.parseInt(questionsArr[j]);
            String answer = isEven(number) ? "yes" : "no";
            answersArr[j] = answer;
        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
