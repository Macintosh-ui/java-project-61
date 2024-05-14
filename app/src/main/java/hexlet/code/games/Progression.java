package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    public static void progressionGame() {
            int[] numbers = getProgression();
            String[] stringNumbers = intToStringArray(numbers);
            int hiddenIndex = Util.getHiddenIndex(numbers.length);
            String firstAnswer = stringNumbers[hiddenIndex];
            stringNumbers[hiddenIndex] = "..";
            String firstQuestion = Arrays.toString(stringNumbers);
            int[] numbers2 = getProgression();
            String[] stringNumbers2 = intToStringArray(numbers2);
            int hiddenIndex2 = Util.getHiddenIndex(numbers.length);
            String secondAnswer = stringNumbers2[hiddenIndex2];
            stringNumbers2[hiddenIndex2] = "..";
            String secondQuestion = Arrays.toString(stringNumbers2);
            int[] numbers3 = getProgression();
            String[] stringNumbers3 = intToStringArray(numbers3);
            int hiddenIndex3 = Util.getHiddenIndex(numbers3.length);
            String thirdAnswer = stringNumbers3[hiddenIndex3];
            stringNumbers3[hiddenIndex3] = "..";
            String thirdQuestion = Arrays.toString(stringNumbers3);
            Engine.engineGame(firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thirdAnswer, RULES);
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
    private static boolean checkAnswer(String question, String answer) {
        return answer.equals(question);
    }
}
