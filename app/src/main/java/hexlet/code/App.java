package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private final static int GREET = 1;
    private final static int EVEN = 2;
    private final static int CALC = 3;
    private final static int GREATEST_COMMON_DIVISOR = 4;
    private final static int PROGRESSION = 5;
    private final static int PRIME = 6;
    private final static int EXIT = 0;
    public static void main(String[] args) {
        Scanner numberChoose = new Scanner(System.in);
        Engine.printGames();
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
