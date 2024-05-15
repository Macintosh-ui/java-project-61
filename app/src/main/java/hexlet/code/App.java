package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final  int GREET = 1;
    private static final  int EVEN = 2;
    private static final  int CALC = 3;
    private static final  int GREATEST_COMMON_DIVISOR = 4;
    private static final  int PROGRESSION = 5;
    private static final  int PRIME = 6;
    private static final  int EXIT = 0;
    private static final Scanner NUMBER_CHOOSE = new Scanner(System.in);
    public static void main(String[] args) {
        printGames();
        int chosenNumber = App.NUMBER_CHOOSE.nextInt();
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
    public static void printGames() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}
