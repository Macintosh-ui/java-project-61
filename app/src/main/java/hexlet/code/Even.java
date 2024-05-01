package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
    String userName = Cli.greeting();
    int currentValue;
    int correctAnswers = 0;
    Scanner answer = new Scanner(System.in);
    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //boolean wrongAnswer = false;
        while (correctAnswers != 3) {
            currentValue = 1+ (int) (Math.random() * 100);
            System.out.println("Question: " + currentValue);
            String userAnswer = answer.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (currentValue % 2 == 0 && userAnswer.equals("yes")) {
                //wrongAnswer = false;
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (currentValue % 2 != 0 && userAnswer.equals("yes")) {
                //wrongAnswer = true;
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                return;
            }
            else if (currentValue % 2 != 0 && userAnswer.equals("no")) {
                //wrongAnswer = false;
                System.out.println("Correct!");
                correctAnswers ++;
            }
            else if (currentValue % 2 == 0 && userAnswer.equals("no")) {
                //wrongAnswer = true;
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                return;
            } //else if (correctAnswers == 3) {
                //System.out.println("Congratulations," + userName + "You won!");
                //return;
            //}

        }
        System.out.println("Congratulations," + userName + "! You won!");
        return;
    }
}
