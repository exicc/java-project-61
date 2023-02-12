package hexlet.code;

import java.util.Random;

public class Even {
    static int roundsCount = 3;

    public static void isEvenGame() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questionsArr = new String[roundsCount];
        for (int j = 0; j < roundsCount; j++) {
            int rnd = new Random().nextInt(10);
            questionsArr[j] = String.valueOf(rnd);
        }

        String[] answersArr = new String[roundsCount];
        for (int j = 0; j < roundsCount; j++) {
            if (Integer.parseInt(questionsArr[j]) % 2 == 0) {
                answersArr[j] = "yes";
            } else {
                answersArr[j] = "no";
            }
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }
}
