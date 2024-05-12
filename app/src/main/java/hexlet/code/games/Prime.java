package hexlet.code.games;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
        int correctAnswers = 0;
        String userName = Cli.greeting();
        System.out.println();
        while (correctAnswers != Engine.NUMBER_OF_QUESTIONS) {
            int number = Util.getPrimeNumber();
            String userAnswer = Engine.questionAndAnswer(number, RULES);
            String correctAnswer = primeCheck(number);
            if (!userAnswer.equals(correctAnswer)) {
                Engine.printGameOver(userAnswer, userName, correctAnswer);
                return;
            } else if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static String primeCheck(int number) {
        String correctAnswer = "";
        if (number < 2) {
            correctAnswer = "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                correctAnswer = "yes";
            }
        }
        return correctAnswer;
        }

    }
}
