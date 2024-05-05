package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Progression {
    public static void progressionGame() {
        Scanner answer = new Scanner(System.in);
        Random random = new Random();
        String userName = Cli.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;

        while (correctAnswers != 3){
            int[] numbers = new int[random.nextInt(5, 10)];
            int coefficient = random.nextInt(1,10);
            numbers[0] = random.nextInt(20);
            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = numbers[0] + i * coefficient;
            }
            int bound = numbers.length;
            int hiddenIndex = random.nextInt(1, bound);
            String[] stringNumbers = new String[bound];
            for (int k = 0; k < bound; k++) {
                stringNumbers[k] = String.valueOf(numbers[k]);
            }
            stringNumbers[hiddenIndex] = "..";
            System.out.println("Question: ");
            for (int j = 0; j < bound; j++) {
                System.out.print(stringNumbers[j]+ " ");
            }
            System.out.println(" ");
            String userAnswer = answer.nextLine();
            String stringHidden = String.valueOf(numbers[hiddenIndex]);
            if (userAnswer.equals(stringHidden)) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (!userAnswer.equals(stringHidden)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + stringHidden + "'");
                System.out.println("Let's try again, " + userName);
                return;
            }
            }
        System.out.println("Congratulations, " + userName + "!");
    }
}
