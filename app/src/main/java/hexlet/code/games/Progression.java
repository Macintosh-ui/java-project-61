package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static void progressionGame() {
        String userName = Cli.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        while (correctAnswers != Engine.NUMBER_OF_QUESTIONS){
            int[] numbers = getProgression();
            String[] stringNumbers = new String[numbers.length];
            for (int k = 0; k < numbers.length; k++) {
                stringNumbers[k] = String.valueOf(numbers[k]);
            }
            int hiddenIndex = Util.getHiddenIndex(numbers.length);
            stringNumbers[hiddenIndex] = "..";
            String userAnswer = Engine.progressionQuestion(stringNumbers);
            String stringHidden = String.valueOf(numbers[hiddenIndex]);
            if (checkAnswer(stringHidden, userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++; }
            else {
                Engine.printGameOver(userAnswer, userName, stringHidden);
                return; }
            }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static int[] getProgression() {
        Random random = new Random();
        int[] numbers = new int[Util.getBound()];
        int coefficient = random.nextInt(Util.getCoefficient());
        numbers[0] = random.nextInt(Util.getFirtNumber());
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[0] + i * coefficient;
        }
        return numbers;
    }
    private static boolean checkAnswer(String question, String answer) {
        return answer.equals(question);
    }
}
