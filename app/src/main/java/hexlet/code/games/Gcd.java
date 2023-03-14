package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {

    static final int NUMBERS_MAX_VALUE = 100;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {

        String[] answersArr = new String[Engine.ROUNDS_COUNT];
        String[] questionsArr = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int firstNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);
            int secondNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);

            questionsArr[i] = firstNumber + " " + secondNumber;
            answersArr[i] = String.valueOf(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }

    static int gcdByEuclidesAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidesAlgorithm(n2, n1 % n2);
    }
}
