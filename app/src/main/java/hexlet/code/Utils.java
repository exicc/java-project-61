package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateNumber(int range) {
        Random rand = new Random();
        int result;
        result = rand.nextInt(range);
        return result;
    }

    public static int generateNumberInRange(int rangeMin, int rangeMax) {
        Random rand = new Random();
        int result;
        result = rand.nextInt((rangeMax - rangeMin) + 1) + rangeMin;
        return result;
    }
}
