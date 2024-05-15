package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
public static final int ROUNDS_COUNT = 3;
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
                System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer1 + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Question: " + secondQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer2 + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Question: " + thirdQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer3)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer3 + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        System.out.println("Congratulations, " + userName + "!");
    }

}
