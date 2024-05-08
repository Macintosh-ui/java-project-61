package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int GREET = 1;
        final int EVEN = 2;
        final int CALC = 3;
        final int GREATEST_COMMON_DIVISOR = 4;
        final int PROGRESSION = 5;
        final int PRIME = 6;
        final int EXIT = 0;
        Scanner numberChoose = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int chosenNumber = numberChoose.nextInt();
        switch (chosenNumber) {
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                Even.evenGame();
                break;
            case CALC:
                Calc.calcGame();
                break;
            case GREATEST_COMMON_DIVISOR:
                GCD.greatestCommonDivisor();
                break;
            case PROGRESSION:
                Progression.progressionGame();
                break;
            case PRIME:
                Prime.primeGame();
            case EXIT:
                return;
            default:
                System.out.println("Invalid number");
        }
    }
}
