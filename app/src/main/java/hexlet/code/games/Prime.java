package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    static final int ROUNDS_COUNT = 3;
    static final int HUNDRED = 100;
    static final int MAX_RAND_VALUE = 20;
    static final int MIN_RAND_VALUE = 1;

    public static void isPrimeGame() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] answersArr = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int rnd = (int) (Math.random() * (MAX_RAND_VALUE) + MIN_RAND_VALUE);
            questionsArr[i] = String.valueOf(rnd);
        }

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            if (isPrime(Integer.parseInt(questionsArr[i]))) {
                answersArr[i] = "yes";
            } else {
                answersArr[i] = "no";
            }
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }

    public static boolean isPrime(int number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(HUNDRED);
    }
}
