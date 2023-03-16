package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {

    static final int MAX_RAND_VALUE = 20;
    static final int MIN_RAND_VALUE = 1;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void isPrimeGame() {

        String[][] qNaArr = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT - 1];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int rnd = Utils.generateNumberInRange(MIN_RAND_VALUE, MAX_RAND_VALUE);
            qNaArr[i][0] = String.valueOf(rnd);
            if (isPrime(Integer.parseInt(qNaArr[i][0]))) {
                qNaArr[i][1] = "yes";
            } else {
                qNaArr[i][1] = "no";
            }
        }
        Engine.gameEngine(qNaArr, DESCRIPTION);
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
