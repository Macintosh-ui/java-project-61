package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
    String userName = Cli.greeting();
    int currentValue;
    int correctAnswers = 0;
    Scanner answer = new Scanner(System.in);
    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctAnswers != 3) { //вывести цикл в отдельный метод
            currentValue = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + currentValue);
            String userAnswer = answer.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (currentValue % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (currentValue % 2 != 0 && userAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                return;
            }
            else if (currentValue % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (currentValue % 2 == 0 && userAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                return;
            }
            else {
                return;
            }
        }
        System.out.println("Congratulations," + userName + "!");
    }
}
