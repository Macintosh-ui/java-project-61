package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numberChoose = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        int chosenNumber = numberChoose.nextInt();
        if (chosenNumber == 1) {
            Cli.greeting();
        }
        if (chosenNumber == 2) {
            Even.evenGame();
        }
        if (chosenNumber == 3) {
            Calc.calcGame();
        }
        if (chosenNumber == 4) {
            GCD.greatestCommonDivisor();
        }
        if (chosenNumber == 0) {
           return;
       }

    }
}
