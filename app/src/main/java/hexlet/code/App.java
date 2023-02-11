package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");
        System.out.print("Your choice: ");
        String game = scanner.next();
        switch (game) {
            case "1" -> Greeting.userGreeting();
            case "2" -> Even.isEvenGame();
            case "3" -> Calc.calcGame();
            case "0" -> System.out.println("Exit successful");
            default -> System.out.println("Unexpected value: " + game);
        }
        scanner.close();
    }
}

