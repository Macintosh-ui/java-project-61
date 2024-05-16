package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void greatestCommonDivisor() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Util.getNumber();
            int secondNumber = Util.getNumber();
            questionsAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAnswers[i][1] = getGreatestCommonDivisor(firstNumber, secondNumber);
        }
        Engine.engineGame(questionsAnswers, RULES);
    }
    private static String getGreatestCommonDivisor(int a, int b) {
        String result = "";
        while (b != 0 && a != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            result = String.valueOf(a + b);
        }
        return result;
    }
}
