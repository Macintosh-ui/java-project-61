package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static void primeGame(){
        Scanner answer = new Scanner(System.in);
        int correctAnswers = 0;
        String userName = Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (correctAnswers != 3) {  // Цикл while вывести в отедльный метод answerCheck
            int number = Util.getPrimeNumber();
            System.out.println("Question: " + number);
            String userAnswer = answer.nextLine();
            String correctAnswer = primeCheck(number);
            if (!userAnswer.equals(correctAnswer)){
                Engine.printGameOver(userAnswer, userName, correctAnswer);
                return;
            }
            else if (userAnswer.equals(correctAnswer)){
                System.out.println("Correct!");
                correctAnswers++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String primeCheck(int number){
        //int counter = 0;
        String correctAnswer = "";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               correctAnswer = "no";
               break;
            }
            else if (number % i != 0){
                correctAnswer = "yes";
            }
        }
        return correctAnswer;
    }
}
