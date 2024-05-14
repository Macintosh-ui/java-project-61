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
        Engine.printGames();
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
}
