package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
    int currentValue;
            currentValue = Util.getNumber();
            String firstQuestion = String.valueOf(currentValue);
            String firstAnswer = isEven(currentValue);
            currentValue = Util.getNumber();
            String secondQuestion = String.valueOf(currentValue);
            String secondAnswer = isEven(currentValue);
            currentValue = Util.getNumber();
            String thirdQuestion = String.valueOf(currentValue);
            String thirdAnswer = isEven(currentValue);
            Engine.engineGame(firstQuestion, secondQuestion, thirdQuestion, firstAnswer, secondAnswer, thirdAnswer, RULES);
    }

    private static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
