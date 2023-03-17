package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {

    static final int NUMBERS_MAX_VALUE = 20;
    static final String[] OPERATORS_ARR = new String[]{"+", "-", "*"};
    static final int QUANTITY_OF_OPERATORS = OPERATORS_ARR.length;
    static final String DESCRIPTION = "What is the result of the expression?";

    public static void calcGame() {

        String[][] qNaArr = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT - 1];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);
            int secondNumber = Utils.generateNumber(NUMBERS_MAX_VALUE);
            int chosenOperator = Utils.generateNumber(QUANTITY_OF_OPERATORS);
            String currentOperator = OPERATORS_ARR[chosenOperator];

            qNaArr[i][0] = firstNumber + " " + currentOperator + " " + secondNumber;
            qNaArr[i][1] = String.valueOf(calculate(currentOperator, firstNumber, secondNumber));
        }
        Engine.gameEngine(qNaArr, DESCRIPTION);
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
