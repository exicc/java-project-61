package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {

    static final int ROUNDS_COUNT = 3;
    static final int NUMBERS_MAX_VALUE = 50;
    static final int NUMBER_OF_OPERATORS = 3;
    public static void calcGame() {

        String description = "What is the result of the expression?";

        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] answersArr = new String[ROUNDS_COUNT];

        Random rand = new Random();

        String[] operatorsArr = new String[]{"+", "-", "*"};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int firstNumber = rand.nextInt(NUMBERS_MAX_VALUE);
            int secondNumber = rand.nextInt(NUMBERS_MAX_VALUE);
            int chosenOperator = rand.nextInt(NUMBER_OF_OPERATORS);
            switch (chosenOperator) {
                case 0:
                    questionsArr[i] = (firstNumber + " " + operatorsArr[0] + " " + secondNumber);
                    answersArr[i] = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    questionsArr[i] = (firstNumber + " " + operatorsArr[1] + " " + secondNumber);
                    answersArr[i] = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    questionsArr[i] = (firstNumber + " " + operatorsArr[2] + " " + secondNumber);
                    answersArr[i] = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    System.out.println("Error: operatorsArr value >= 3");
                    break;
            }
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }
}
