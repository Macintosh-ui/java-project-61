package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numberChoose = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        int choosenNumber = numberChoose.nextInt();
        if (choosenNumber == 1) {
            Cli.greeting();
        }
        if (choosenNumber == 2) {
            Even.evenGame();
        }
        if (choosenNumber == 0) {
           return;
       }

    }
}
