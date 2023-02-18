package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    static final int ROUNDS_COUNT = 3;
    static final int TRIPLE_ROUNDS_COUNT = ROUNDS_COUNT * 3;
    static final int MAX_RND_NUMBER = 10;
    static final int PREV_CHAR = 1;
    static final int NEXT_CHAR = 2;


    public static void calcGame() {
        int counter = 0;
        String description = "What is the result of the expression?";

        int[] numbersArr = new int[TRIPLE_ROUNDS_COUNT];
        for (int j = 0; j < TRIPLE_ROUNDS_COUNT; j++) {
            int rnd = new Random().nextInt(MAX_RND_NUMBER);
            numbersArr[j] = (rnd);
        }

        char[] operatorsArr = {'+', '-', '*'};
        String[] answersArr = new String[ROUNDS_COUNT];

        String[] questionsArrPre = new String[TRIPLE_ROUNDS_COUNT];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            char operator = getRandomChar(operatorsArr);
            int number1 = getRandom(numbersArr);
            int number2 = getRandom(numbersArr);

            questionsArrPre[counter] = String.valueOf(number1);
            questionsArrPre[counter + PREV_CHAR] = Character.toString(operator);
            questionsArrPre[counter + NEXT_CHAR] = String.valueOf(number2);

            counter += ROUNDS_COUNT;
        }

        counter = 0;
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            String operator = (questionsArrPre[counter + PREV_CHAR]);
            int number1 = Integer.parseInt(questionsArrPre[counter]);
            int number2 = Integer.parseInt(questionsArrPre[counter + NEXT_CHAR]);
            int result = 0;
            switch (operator) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                default -> System.out.println("Error");
            }
            answersArr[j] = String.valueOf(result);
            counter += ROUNDS_COUNT;
        }
        counter = 0;
        String[] questionsArr = new String[ROUNDS_COUNT];
        for (int k = 0; k < ROUNDS_COUNT; k++) {
            String operator = (questionsArrPre[counter + PREV_CHAR]);
            int number1 = Integer.parseInt(questionsArrPre[counter]);
            int number2 = Integer.parseInt(questionsArrPre[counter + NEXT_CHAR]);

            questionsArr[k] = number1 + " " + operator + " " + number2;
            counter += ROUNDS_COUNT;
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static char getRandomChar(char[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
