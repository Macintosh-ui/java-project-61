package hexlet.code.games;


public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    public static void progressionGame() {
        String userName = Cli.greeting();
        System.out.println(RULES);
        int correctAnswers = 0;
        while (correctAnswers != Engine.NUMBER_OF_QUESTIONS) {
            int[] numbers = getProgression();
            String[] stringNumbers = intToStringArray(numbers);
            int hiddenIndex = Util.getHiddenIndex(numbers.length);
            stringNumbers[hiddenIndex] = "..";
            String userAnswer = Engine.progressionQuestion(stringNumbers);
            String stringHidden = String.valueOf(numbers[hiddenIndex]);
            if (checkAnswer(stringHidden, userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                Engine.printGameOver(userAnswer, userName, stringHidden);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
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
