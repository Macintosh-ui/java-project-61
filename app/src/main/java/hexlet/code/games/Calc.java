package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    final static String RULES = "What is the result of the expression?";
    public static void calcGame(){
        String userName = Cli.greeting();
        int firstNumber, secondNumber;
        int correctAnswers = 0;
        while (correctAnswers != Engine.NUMBER_OF_QUESTIONS) {
            firstNumber = Util.getNumber();
            secondNumber = Util.getNumber();
            String operator = getOperator();
            String question = firstNumber + " " + operator + " " + secondNumber;
            String userAnswer = Engine.questionAndAnswer(question, RULES);
            String result = getAnswer(firstNumber, secondNumber, operator);
            if (!userAnswer.equals(result)) {
                Engine.printGameOver(userAnswer, userName, result);
                return;
            }
               System.out.println("Correct!");
               correctAnswers++;
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String getOperator() {
        String[] operators;
        operators = new String[]{"-", "+", "*"};
        Random random = new Random();
        int i = random.nextInt(3);
        return operators[i];
    }
    private static String getAnswer(int firstNumber, int secondNumber, String operator) {
        int result = 0;
        switch (operator) {
            case "+": result = firstNumber + secondNumber;
            break;
            case "-": result = firstNumber - secondNumber;
            break;
            case "*": result = firstNumber * secondNumber;
            break;
            default: System.out.println("Invalid operator");
        }
        return Integer.toString(result);
    }
}
