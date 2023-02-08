package hexlet.code;

import java.util.Scanner;
public class Even {
    public static void isEvenGame() {
        Scanner scanner = new Scanner(System.in);
        String userName = Greeting.userGreeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rightAnswersCount = 0;
        for (int i = 0; i < 3; i++) {
            int ranNum = (int) ((Math.random() * 100) + 1);
            System.out.println("Question: " + ranNum);
            System.out.print("Your answer: ");
            String currentAnswer = scanner.next();

            String rightAnswer;
            if (ranNum % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            if (currentAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                rightAnswersCount++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was %s.%n", currentAnswer, rightAnswer);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (rightAnswersCount >= 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
