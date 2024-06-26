package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final Scanner NUMBER_CHOOSE = new Scanner(System.in);

    public static void main(String[] args) {
        printGames();
        String chosenNumber = App.NUMBER_CHOOSE.nextLine();
        switch (chosenNumber) {
            case "1" -> Cli.greeting();
            case "2" -> Even.playEvenGame();
            case "3" -> Calc.playCalcGame();
            case "4" -> GCD.playGcdGame();
            case "5" -> Progression.playProgressionGame();
            case "6" -> Prime.playPrimeGame();
            case "0" -> { }
            default -> System.out.println("Invalid number");
        }
    }

    public static void printGames() {
        System.out.println("""
                Welcome to the Brain Games!
                Please enter the game number and press Enter");
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression;
                6 - Prime
                0 - Exit""");
    }
}
