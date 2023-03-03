package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomGen;


public class Calc {
    static final int ROUNDS_NUMBER = Engine.getRoundsCount();
    static final int NUMBERS_MAX_VALUE = 20;
    static final String[] OPERATORS_ARR = new String[]{"+", "-", "*"};
    static final int QUANTITY_OF_OPERATORS = OPERATORS_ARR.length;
    static final String DESCRIPTION = "What is the result of the expression?";

    public static void calcGame() {
        String[] questionsArr = new String[ROUNDS_NUMBER];
        String[] answersArr = new String[ROUNDS_NUMBER];

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int firstNumber = RandomGen.getRandomNumber(NUMBERS_MAX_VALUE);
            int secondNumber = RandomGen.getRandomNumber(NUMBERS_MAX_VALUE);
            int chosenOperator = RandomGen.getRandomNumber(QUANTITY_OF_OPERATORS);
            String currentOperator = OPERATORS_ARR[chosenOperator];

            questionsArr[i] = firstNumber + " " + currentOperator + " " + secondNumber;
            answersArr[i] = String.valueOf(calculate(currentOperator, firstNumber, secondNumber));
        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }

    public static int calculate(String operator, int firstNumber, int secondNumber) {
        int result = 0;
        switch (operator) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            default -> {
                System.out.println("Unknown operator.");
                return result;
            }
        }
    }
}
