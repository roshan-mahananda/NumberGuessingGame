package NumberGuessingGame;

import NumberGuessingGame.Control;
import NumberGuessingGame.Range;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** WELCOME TO NUMBER GAME ***");

        System.out.print("Enter your initial range ... : ");
        int minRange = scanner.nextInt();

        System.out.print("Enter your last range ... : ");
        int maxRange = scanner.nextInt();

        Range range =  new Range(minRange, maxRange);
        Control control = new Control(range);

        control.play();
    }
}
