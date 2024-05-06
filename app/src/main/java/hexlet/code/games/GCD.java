package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class GCD {

    public static void greatestCommonDivisor() {
        String userName = Cli.greeting();
        Scanner answer = new Scanner(System.in);
        int correctAnswers = 0;
        int firstNumber;
        int secondNumber;
        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (correctAnswers != 3) {
            firstNumber = random.nextInt(1,100);
            secondNumber = random.nextInt(1,100);
            System.out.print("Question: " + firstNumber + " " + secondNumber);
            int result = getGreatestCommonDivisor(firstNumber, secondNumber);
            String stringResult = Integer.toString(result);
            String userAnswer = answer.nextLine();
            String trimmedAnswer = userAnswer.trim();
            if (!trimmedAnswer.equals(stringResult)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            correctAnswers++;
            }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static int getGreatestCommonDivisor(int a, int b) {
        int result = 0;
        if (a <=0 || b <=0) throw new UnsupportedOperationException("Incorrect numbers");
        while (b != 0 && a != 0) {
            if (a>b) {
                a = a%b;
            }
            else {
                b = b%a;
            }
            result = a + b;
        }

        return result;
    }
}
