package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {

    public static void printGameOver(String userAnswer, String userName, String correctAnswer) {
        System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }

public static void engineGame(String firstQuestion, String secondQuestion, String thirdQuestion,
                              String correctAnswer1, String correctAnswer2, String correctAnswer3,
                              String rules) {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.greeting();
        System.out.println(rules);
            System.out.println("Question: " + firstQuestion);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer1)) {
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer1);
                return;
            }
            System.out.println("Question: " + secondQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer2)) {
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer2);
                return;
            }
            System.out.println("Question: " + thirdQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer3)) {
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer3);
                return;
            }
        System.out.println("Congratulations, " + userName + "!");
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
