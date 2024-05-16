package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    public static void progressionGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int[] numbers = getProgression();
            String[] stringNumbers = intToStringArray(numbers);
            int hiddenIndex = Util.getHiddenIndex(numbers.length - 1);
            stringNumbers[hiddenIndex] = "..";
            questionsAnswers[i][0] = Arrays.toString(stringNumbers).replace("[", "").replace("]", "").replace(",", "");
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
    private static int[] getProgression() {
        int[] numbers = new int[Util.getBound()];
        int coefficient = Util.getCoefficient();
        numbers[0] = Util.getFirtNumber();
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[0] + i * coefficient;
        }
        return numbers;
    }
}
