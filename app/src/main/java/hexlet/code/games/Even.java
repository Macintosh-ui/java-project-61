package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int BOUND = 100;
    private static final int NO_NULL = 1;

    public static void playEvenGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int currentValue = Util.getNumber(NO_NULL, BOUND);
            questionsAnswers[i][0] = String.valueOf(currentValue);
            if (isEven(currentValue)) {
                questionsAnswers[i][1] = "yes";
            } else {
                questionsAnswers[i][1] = "no";
            }
        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
