package hexlet.code.games;

import java.util.Random;

public class Util {
    public static int getNumber(){
        Random rand = new Random();
        int result = rand.nextInt(100);
        return result;
    }
    public static int getCoefficient(){
        Random rand = new Random();
        int result = rand.nextInt(5, 10);
        return result;
    }
    public static int getBound(){
        Random rand = new Random();
        int result = rand.nextInt(5, 10);
        return result;
    }
    public static int getFirtNumber(){
        Random rand = new Random();
        int result = rand.nextInt(20);
        return result;
    }
    public static int getPrimeNumber(){
        Random rand = new Random();
        int result = rand.nextInt(2, 100);
        return result;
    }
    public static int getHiddenIndex(int length){
        Random rand = new Random();
        int result = rand.nextInt(length);
        return result;
    }
}
