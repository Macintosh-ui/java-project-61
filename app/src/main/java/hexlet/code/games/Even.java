package hexlet.code.games;

import java.util.Scanner;

public class Even {
    final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGame() {
    String userName = Cli.greeting();
    int currentValue;
    int correctAnswers = 0;
    Scanner answer = new Scanner(System.in);
        while (correctAnswers != 3) {
            currentValue = Util.getNumber();
            String userAnswer = Engine.questionAndAnswer(currentValue);
            if (userAnswer.equals(isEven(currentValue))) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else if (!userAnswer.equals(isEven(currentValue)) && isEven(currentValue).equals("no")) {
                Engine.printGameOver(userAnswer, userName, isEven(currentValue));
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String isEven(int number){
        if(number % 2 == 0) return "yes";
        return "no";
    }
}
