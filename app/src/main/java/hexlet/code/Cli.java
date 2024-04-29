package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting(){
        Scanner name = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = name.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
