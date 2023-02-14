package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gameEngine(String[] questionsArr, String[] answersArr, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        int gamesCount = 3;
        int gamesCounter = 0;

        for (int i = 0; i < gamesCount; i++) {
            System.out.println("Question: " + questionsArr[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(answersArr[i])) {
                System.out.println("Correct!");
                gamesCounter++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!%n", answer, answersArr[i], name);
                break;
            }
        }
        if (gamesCounter >= 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
