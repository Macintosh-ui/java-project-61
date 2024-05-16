package hexlet.code;

import hexlet.code.games.Cli;
import java.util.Scanner;

public class Engine {
    public static final int COLUMNS = 2;
    public static final int ROUNDS_COUNT = 3;

    public static void engineGame(String[][] questionsAnswers, String rules) {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.greeting();
        System.out.println(rules);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionsAnswers[i][0]);
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equals(questionsAnswers[i][1])) {
                System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + questionsAnswers[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
