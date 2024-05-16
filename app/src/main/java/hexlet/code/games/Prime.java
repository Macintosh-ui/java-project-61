package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Util.getPrimeNumber();
            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = primeCheck(number);
        }
        Engine.engineGame(questionsAnswers, RULES);
    }

    private static String primeCheck(int number) {
        String correctAnswer = "";
        if (number < 2) {
            correctAnswer = "no";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                break;
            } else if (number % i != 0) {
                correctAnswer = "yes";
            }
        }
        return correctAnswer;
    }

    }
