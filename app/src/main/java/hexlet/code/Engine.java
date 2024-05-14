package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;

    public static void printGameOver(String userAnswer, String userName, String correctAnswer) {
        System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static String questionAndAnswer(int currentValue, String rules) {
        Scanner answer = new Scanner(System.in);
        System.out.println(rules);
        System.out.println("Question: " + currentValue);
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static String questionAndAnswer(String currentValue, String rules) {
        Scanner answer = new Scanner(System.in);
        System.out.println(rules);
        System.out.println("Question: " + currentValue);
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static void engineGame(String firstQuestion, String secondQuestion, String thirdQuestion, String correctAnswer1, String correctAnswer2, String correctAnswer3, String rules) {
        Scanner scanner = new Scanner(System.in);
        int questions = 0;
        String userName = Cli.greeting();
        System.out.println(rules);
        while ( questions != NUMBER_OF_QUESTIONS) {
            System.out.println("Question: " + firstQuestion);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer1)) {
                questions++;
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer1);
                return;
            }
            System.out.println("Question: " + secondQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer2)) {
                questions++;
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer2);
                return;
            }
            System.out.println("Question: " + thirdQuestion);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer3)) {
                questions++;
                System.out.println("Correct!");
            } else {
                printGameOver(userAnswer, userName, correctAnswer3);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

    }
    public static String progressionQuestion(String[] question) {
        Scanner answer = new Scanner(System.in);
        System.out.print("Question: ");
        for (int j = 0; j < question.length; j++) {
            System.out.print(question[j] + " ");
        }
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
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
