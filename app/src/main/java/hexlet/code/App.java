package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        System.out.print("Your choice: ");
        String game = scanner.next();
        switch (game) {
            case "1":
                Greeting.userGreeting();
                break;
            case "2":
                Even.isEvenGame();
                break;
            case "0":
                System.out.println("Exit successful");
                break;
            default:
                System.out.println("Error, exiting");
        }
        scanner.close();
    }
}
