package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int PRIME_ORIGIN = 2;
    private static final int PRIME_BOUND = 100;

    public static void playPrimeGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Util.getNumber(PRIME_ORIGIN, PRIME_BOUND);
            questionsAnswers[i][0] = String.valueOf(number);
            if (primeCheck(number)) {
                questionsAnswers[i][1] = "yes";
            } else {
                questionsAnswers[i][1] = "no";
            }

        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static boolean primeCheck(int number) {
        if (number < 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
