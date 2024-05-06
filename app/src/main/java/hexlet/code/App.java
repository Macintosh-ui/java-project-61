package hexlet.code;

import hexlet.code.games.*;

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
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int chosenNumber = numberChoose.nextInt();
        switch (chosenNumber) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calcGame();
                break;
            case 4:
                GCD.greatestCommonDivisor();
                break;
            case 5:
                Progression.progressionGame();
                break;
            case 6:
                Prime.primeGame();
            default:
                return;
        }
    }
}
