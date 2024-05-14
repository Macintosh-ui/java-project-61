package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
            int number = Util.getPrimeNumber();
            String firstQuestion = String.valueOf(number);
            String firstAnswer = primeCheck(number);
            number = Util.getPrimeNumber();
            String secondQuestion = String.valueOf(number);
            String secondAnswer = primeCheck(number);
            number = Util.getPrimeNumber();
            String thirdQuestion = String.valueOf(number);
            String thirdAnswer = primeCheck(number);
Engine.engineGame(firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thirdAnswer, RULES);
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
