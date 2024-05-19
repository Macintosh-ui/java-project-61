package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int ORIGIN = 5;
    private static final int BOUND = 10;
    private static final int FIRST_NUMBER_BOUND = 20;
    private static final String RULES = "What number is missing in the progression?";

    public static void progressionGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int coefficient = Util.getNumber(ORIGIN, BOUND);
            int firstNumber = Util.getNumber(FIRST_NUMBER_BOUND);
            int length = Util.getNumber(ORIGIN, BOUND);
            int[] numbers = getProgression(coefficient, firstNumber, length);
            String[] stringNumbers = intToStringArray(numbers);
            int hiddenIndex = Util.getNumber(numbers.length - 1);
            stringNumbers[hiddenIndex] = "..";
            questionsAnswers[i][0] = String.join(",", stringNumbers).replace(",", " ");
            questionsAnswers[i][1] = String.valueOf(numbers[hiddenIndex]);
        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static String[] intToStringArray(int[] numbers) {
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        return stringNumbers;
    }

    private static int[] getProgression(int coefficient, int firstNumber, int length) {
        int[] numbers = new int[length];
        numbers[0] = firstNumber;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[0] + i * coefficient;
        }
        return numbers;
    }
}
