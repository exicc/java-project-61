package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void gameEngine(String[][] questionsAndAnswers, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        for (String[] item : questionsAndAnswers) {
            //for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + item[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(item[1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", answer, item[1], name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    // Метод без параметров используется для приветствия под номером 1 из App
    public static void gameEngine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
