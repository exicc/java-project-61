package hexlet.code;

import java.util.Random;

public class RandomGen {

    public static int getRandomNumber(int range) {
        Random rand = new Random();
        int result = rand.nextInt(range);
        return result;
    }
    public static int getRandomNumbersInRange(int rangeMax, int rangeMin) {
        Random rand = new Random();
        int result = rand.nextInt((rangeMax - rangeMin) + 1) + rangeMin;
        return result;
    }
}
