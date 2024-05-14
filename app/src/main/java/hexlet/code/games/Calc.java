package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int OPERATORS_COUNT = 3;
    public static void calcGame() {
        int firstNumber;
        int secondNumber;
            firstNumber = Util.getNumber();
            secondNumber = Util.getNumber();
            String operator = getOperator();
            String firstQuestion = firstNumber + " " + operator + " " + secondNumber;
            String firstAnswer = getAnswer(firstNumber, secondNumber, operator);
            firstNumber = Util.getNumber();
            operator = getOperator();
            secondNumber = Util.getNumber();
            String secondQuestion = firstNumber + " " + operator + " " + secondNumber;
            String secondAnswer = getAnswer(firstNumber, secondNumber, operator);
            firstNumber = Util.getNumber();
            operator = getOperator();
            secondNumber = Util.getNumber();
            String thirdQuestion = firstNumber + " " + operator + " " + secondNumber;
            String thirdAnswer = getAnswer(firstNumber, secondNumber, operator);
            Engine.engineGame(firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thirdAnswer, RULES);
    }
    private static String getOperator() {
        String[] operators;
        operators = new String[]{"-", "+", "*"};
        Random random = new Random();
        int i = random.nextInt(OPERATORS_COUNT);
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
