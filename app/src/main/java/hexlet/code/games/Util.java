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
        int result = RANDOM.nextInt(MAX_BOUND);
        return result;
    }

    public static int getCoefficient(){
        int result = RANDOM.nextInt(MAX_ORIGIN, MIDDLE_BOUND);
        return result;
    }

    public static int getBound() {
        int result = RANDOM.nextInt(MAX_ORIGIN, MIDDLE_BOUND);
        return result;
    }

    public static int getFirtNumber() {
        int result = RANDOM.nextInt(FIRST_NUMBER_BOUND);
        return result;
    }

    public static int getPrimeNumber() {

        int result = RANDOM.nextInt(MIN_ORIGIN,MAX_BOUND);
        return result;
    }

    public static int getHiddenIndex(int length) {
        int result = RANDOM.nextInt(length);
        return result;
    }
}
