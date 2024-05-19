package hexlet.code;

import java.util.Random;

public class Util {

    private static final Random RANDOM = new Random();

    public static int getNumber(int origin, int bound) {
        return RANDOM.nextInt(origin, bound);
    }

    public static int getNumber(int bound) {
        return RANDOM.nextInt(bound);
    }
}
