package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    static final int ROUNDS_COUNT = 3;

    public static void calcGame() {
        String description = "What is the result of the expression?";

        int[] numbersArr = new int[ROUNDS_COUNT * 3];
        for (int j = 0; j < ROUNDS_COUNT * 3; j++) {
            int rnd = new Random().nextInt(10);
            numbersArr[j] = (rnd);
        }

        char[] operatorsArr = {'+', '-', '*'};
        String[] answersArr = new String[ROUNDS_COUNT];

        int counter = 0;
        String[] questionsArrPre = new String[ROUNDS_COUNT * 3];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            char operator = getRandomChar(operatorsArr);
            int number1 = getRandom(numbersArr);
            int number2 = getRandom(numbersArr);

            questionsArrPre[counter] = String.valueOf(number1);
            questionsArrPre[counter + 1] = Character.toString(operator);
            questionsArrPre[counter + 2] = String.valueOf(number2);

            counter += 3;
        }

        counter = 0;
        for (int j = 0; j < ROUNDS_COUNT; j++) {
            String operator = (questionsArrPre[counter + 1]);
            int number1 = Integer.parseInt(questionsArrPre[counter]);
            int number2 = Integer.parseInt(questionsArrPre[counter + 2]);
            switch (operator) {
                case "+" -> answersArr[j] = String.valueOf(number1 + number2);
                case "-" -> answersArr[j] = String.valueOf(number1 - number2);
                case "*" -> answersArr[j] = String.valueOf(number1 * number2);
            }
            counter += 3;
        }
        counter = 0;
        String[] questionsArr = new String[ROUNDS_COUNT];
        for (int k = 0; k < ROUNDS_COUNT; k++) {
            String operator = (questionsArrPre[counter + 1]);
            int number1 = Integer.parseInt(questionsArrPre[counter]);
            int number2 = Integer.parseInt(questionsArrPre[counter + 2]);

            questionsArr[k] = number1 + " " + operator + " " + number2;
            counter += 3;
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
