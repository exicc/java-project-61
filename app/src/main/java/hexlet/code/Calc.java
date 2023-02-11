package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        String description = "What is the result of the expression?";
        char[] operatorsArr = {'+', '-', '*'};
        int[] objectsArr = new int[15];
        for (int j = 0; j < 15; j++) {
            int rnd = new Random().nextInt(10);
            objectsArr[j] = rnd;
        }

        Scanner scanner = new Scanner(System.in);
        String userName = Greeting.userGreeting();

        System.out.println(description);

        int rightAnswersCount = 0;
        for (int i = 0; i < 3; i++) {
            char operator = getRandomChar(operatorsArr);
            int firstNum = getRandom(objectsArr);
            int secondNum = getRandom(objectsArr);

            System.out.println("Question: " + firstNum + " " + operator + " " + secondNum);
            System.out.print("Your answer: ");
            String currentAnswer = scanner.next();
            String rightAnswer = switch (operator) {
                case '+' -> String.valueOf(firstNum + secondNum);
                case '-' -> String.valueOf(firstNum - secondNum);
                case '*' -> String.valueOf(firstNum * secondNum);
                default -> null;
            };

            if (currentAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                rightAnswersCount++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was %s.%n", currentAnswer, rightAnswer);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (rightAnswersCount >= 3) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }
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
