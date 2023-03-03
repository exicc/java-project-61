package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomGen;


public class Even {
    static final int ROUNDS_COUNT = Engine.getRoundsCount();
    static final int MAX_RND_NUMBER = 10;
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void isEvenGame() {



        String[] questionsArr = new String[ROUNDS_COUNT];
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            int rnd = RandomGen.getRandomNumber(MAX_RND_NUMBER);

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
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }
}
