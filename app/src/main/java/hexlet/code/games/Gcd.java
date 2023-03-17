package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {

    static final int NUMBERS_MAX_VALUE = 100;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT - 1];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int firstNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);
            int secondNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);

            questionsAndAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAndAnswers[i][1] = String.valueOf(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameEngine(questionsAndAnswers, DESCRIPTION);
    }

    static int gcdByEuclidesAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidesAlgorithm(n2, n1 % n2);
    }
}
