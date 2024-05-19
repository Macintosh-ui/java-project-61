package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final int MAX_BOUND = 100;
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int NO_NULL = 1;

    public static void greatestCommonDivisor() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Util.getNumber(MAX_BOUND, NO_NULL);
            int secondNumber = Util.getNumber(MAX_BOUND, NO_NULL);
            questionsAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAnswers[i][1] = String.valueOf(getGreatestCommonDivisor(firstNumber, secondNumber));
        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        int result = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            result = a + b;
        }
        return result;
    }
}
