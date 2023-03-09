package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "1" -> Engine.gameEngine();
            case "2" -> Even.isEvenGame();
            case "3" -> Calc.calcGame();
            case "4" -> Gcd.gcdGame();
            case "5" -> Progression.progressionGame();
            case "6" -> Prime.isPrimeGame();
            case "0" -> System.out.println("Exit successful");
            default -> System.out.println("Unexpected value: " + gameNumber + "\nExiting.");
        }
        scanner.close();
    }
}
