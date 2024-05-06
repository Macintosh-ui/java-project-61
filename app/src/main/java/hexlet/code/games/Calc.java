package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame(){
        String userName = Cli.greeting();
        int firstNumber;
        int secondNumber;

        Random random = new Random();
        Scanner answer = new Scanner(System.in);

        int result = 0;
        int correctAnswers = 0;

        System.out.println("What is the result of the expression?");
        while (correctAnswers != 3) {
            firstNumber = random.nextInt(100);
            secondNumber = random.nextInt(100);
            String operator = getOperator();
           System.out.println("Question: " + firstNumber + operator + secondNumber);
            result = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> result;
            };
           String stringResult = Integer.toString(result);
           String userAnswer = answer.nextLine();
           System.out.println("Your answer: " + userAnswer);
            if (!userAnswer.equals(stringResult)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
               System.out.println("Correct!");
               correctAnswers++;

        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String getOperator(){
        String[] operators;
        operators = new String[]{"-", "+", "*"};
        Random random = new Random();
        int i = random.nextInt(3);
        return operators[i];
    }
}
