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
    public static String questionAndAnswer(int currentValue, String rules){
        Scanner answer = new Scanner(System.in);
        System.out.println(rules);
        System.out.println("Question: " + currentValue);
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static String questionAndAnswer(String currentValue, String rules){
        Scanner answer = new Scanner(System.in);
        System.out.println(rules);
        System.out.println("Question: " + currentValue);
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static String progressionQuestion(String[] question){
        Scanner answer = new Scanner(System.in);
        System.out.print("Question: ");
        for (int j = 0; j < question.length; j++) {
            System.out.print(question[j]+ " ");
        }
        String userAnswer = answer.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static void printGames(){
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
