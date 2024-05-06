package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static void primeGame(){
        Scanner answer = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;
        String userName = Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (correctAnswers != 3) {  // Цикл while вывести в отедльный метод answerCheck
            int number = random.nextInt(2,100);
            System.out.println("Question: " + number);
            String userAnswer = answer.nextLine();
            if (primeCheck(number) == false && userAnswer.equals("yes")){
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            else if (primeCheck(number) == false && userAnswer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (primeCheck(number) == true && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (primeCheck(number) == true && userAnswer.equals("no")) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static boolean primeCheck(int number){
        //int counter = 0;
        boolean check = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               check = false;
               break;
            }
            else if (number % i != 0){
                check = true;
            }
        }
        return check;
    }
}
