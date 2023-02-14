package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static int roundsCount = 3;
    public static void GCDgame() {

        String description = "Find the greatest common divisor of given numbers.";

        int[] numbersArr = new int[roundsCount * 2];
        for (int j = 0; j < roundsCount * 2; j++) {
            int rnd = new Random().nextInt(100);
            numbersArr[j] = (rnd);
        }

        int counter = 0;
        String[] answersArr = new String[roundsCount];
        for (int i = 0; i < answersArr.length; i++) {
            answersArr[i] = String.valueOf(gcdByEuclidsAlgorithm(numbersArr[counter], numbersArr[counter + 1]));
            counter += 2;
        }

        counter = 0;
        String[] questionsArr = new String[roundsCount];
        for (int i = 0; i < roundsCount; i++) {
            questionsArr[i] = numbersArr[counter] + " " + numbersArr[counter + 1];
            counter += 2;
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
