package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int ROUNDS_COUNT = 3;

    public static void gameEngine(String[] questionsArr, String[] answersArr, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionsArr[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(answersArr[i])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", answer, answersArr[i], name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static void gameEngine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }
}
