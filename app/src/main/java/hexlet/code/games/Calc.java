package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_BOUND = 100;

    public static void calcGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Util.getNumber(MAX_BOUND);
            int secondNumber = Util.getNumber(MAX_BOUND);
            String operator = getOperator();
            questionsAnswers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            questionsAnswers[i][1] = String.valueOf(getAnswer(firstNumber, secondNumber, operator));
        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static String getOperator() {
        String[] operators = new String[]{"-", "+", "*"};
        int i = Util.getNumber(operators.length);
        return operators[i];
    }

    private static int getAnswer(int firstNumber, int secondNumber, String operator) {
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
        return result;
    }
}
