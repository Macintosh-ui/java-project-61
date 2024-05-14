package hexlet.code.games;

import java.util.Random;

public class Util {

    private static final int MAX_BOUND = 100;
    private static final int MIDDLE_BOUND = 10;
    private static final int FIRST_NUMBER_BOUND = 20;
    private static final int MAX_ORIGIN = 5;
    private static final int MIN_ORIGIN = 2;
    private static final Random RANDOM = new Random();

    public static int getNumber() {
        return RANDOM.nextInt(MAX_BOUND);
    }

    public static int getCoefficient() {
        return RANDOM.nextInt(MAX_ORIGIN, MIDDLE_BOUND);
    }

    public static int getBound() {
        return RANDOM.nextInt(MAX_ORIGIN, MIDDLE_BOUND);
    }

    public static int getFirtNumber() {
        return RANDOM.nextInt(FIRST_NUMBER_BOUND);
    }

    public static int getPrimeNumber() {
        return RANDOM.nextInt(MIN_ORIGIN, MAX_BOUND);
    }

    public static int getHiddenIndex(int length) {
        return RANDOM.nextInt(length);
    }
}
