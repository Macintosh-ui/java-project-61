package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void greatestCommonDivisor() {
            int firstNumber = Util.getNumber();
            int secondNumber = Util.getNumber();
            String firstQuestion = firstNumber + " " + secondNumber;
            String firstAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
            firstNumber = Util.getNumber();
            secondNumber = Util.getNumber();
            String secondQuestion = secondNumber + " " + firstNumber;
            String secondAnswer = getGreatestCommonDivisor(secondNumber, firstNumber);
            firstNumber = Util.getNumber();
            secondNumber = Util.getNumber();
            String thirdQuestion = firstNumber + " " + secondNumber;
            String thirdAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
Engine.engineGame(firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thirdAnswer, RULES);
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
