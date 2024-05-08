package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public final int NUMBER_OF_QUESTIONS = 3;
    private static String userName;

    public static void getUserName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
    }
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        getUserName();
        System.out.println("Hello, " + userName + "!");
    }
    public static void gameStart() {
        greet();

    }
    public static void printGameOver(String userAnswer, String userName, String correctAnswer){
        System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static String questionAndAnswer(int currentValue){
        Scanner answer = new Scanner(System.in);
        System.out.println("Question: " + currentValue);
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
}
