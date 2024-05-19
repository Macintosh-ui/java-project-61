package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COLUMNS = 2;
    public static final int ROUNDS_COUNT = 3;

    public static void engineGame(String[][] questionsAnswers, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionsAnswers[i][0]);
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equals(questionsAnswers[i][1])) {
                System.out.print("'" + userAnswer + "' " + "is wrong answer ;(.");
                System.out.print(" Correct answer was '" + questionsAnswers[i][1] + "'");
                System.out.println();
                System.out.println("Let's try again, " + userName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
