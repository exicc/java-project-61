package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomGen;


public class Prime {
    static final int ROUNDS_COUNT = Engine.getRoundsCount();
    static final int MAX_RAND_VALUE = 20;
    static final int MIN_RAND_VALUE = 1;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void isPrimeGame() {

        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] answersArr = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int rnd = RandomGen.getRandomNumbersInRange(MAX_RAND_VALUE, MIN_RAND_VALUE);
            questionsArr[i] = String.valueOf(rnd);
            if (isPrime(Integer.parseInt(questionsArr[i]))) {
                answersArr[i] = "yes";
            } else {
                answersArr[i] = "no";
            }
        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
