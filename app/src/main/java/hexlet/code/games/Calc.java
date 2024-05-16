package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int OPERATORS_COUNT = 3;

    public static void calcGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Util.getNumber();
            int secondNumber = Util.getNumber();
            String operator = getOperator();
            questionsAnswers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            questionsAnswers[i][1] = getAnswer(firstNumber, secondNumber, operator);
        }
        Engine.engineGame(questionsAnswers, RULES);
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
