package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {

    String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][Engine.COLUMNS];
    for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
        int currentValue = Util.getNumber();
        questionsAnswers[i][0] = String.valueOf(currentValue);
        questionsAnswers[i][1] = isEven(currentValue);
    }
    Engine.engineGame(questionsAnswers, RULES);
    }

    private static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
