package hexlet.code.games;

public class GCD {
private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void greatestCommonDivisor() {
        String userName = Cli.greeting();
        int correctAnswers = 0;
        System.out.println();
        while (correctAnswers != 3) {
            int firstNumber = Util.getNumber();
            int secondNumber = Util.getNumber();
            String currentValue = firstNumber + " " + secondNumber;
            String userAnswer = Engine.questionAndAnswer(currentValue, RULES);
            String result = getGreatestCommonDivisor(firstNumber, secondNumber);
            if (!userAnswer.equals(result)) {
                Engine.printGameOver(userAnswer, userName, result);
                return;
            }
            System.out.println("Correct!");
            correctAnswers++;
            }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String getGreatestCommonDivisor(int a, int b) {
        String result = "";
        if (a <=0 || b <=0) throw new UnsupportedOperationException("Incorrect numbers");
        while (b != 0 && a != 0) {
            if (a>b) {
                a = a%b;
            }
            else {
                b = b%a;
            }
            result = String.valueOf(a + b);
        }

        return result;
    }
}
