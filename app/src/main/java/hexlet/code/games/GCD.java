package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int ROUNDS_COUNT = 3;
    static final int NUMBERS_MAX_VALUE = 100;

    public static void gcdGame() {

        String description = "Find the greatest common divisor of given numbers.";

        String[] answersArr = new String[ROUNDS_COUNT];
        String[] questionsArr = new String[ROUNDS_COUNT];
        Random rand = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {

            int firstNumber = rand.nextInt(NUMBERS_MAX_VALUE);
            int secondNumber = rand.nextInt(NUMBERS_MAX_VALUE);

            questionsArr[i] = firstNumber + " " + secondNumber;
            answersArr[i] = String.valueOf(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }

    static int gcdByEuclidesAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidesAlgorithm(n2, n1 % n2);
    }
}
