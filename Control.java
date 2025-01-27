package NumberGuessingGame;

import java.util.Scanner;

public class Control{
    public GenerateNumber generateNumber;
    public int targetNumber;
    public Control(Range range){
        this.generateNumber = new GenerateNumber(range);
        this.targetNumber = generateNumber.generateRandomNumber();
    }
    public void play(){
        boolean win = false;
        int score = 0;
        do{
            System.out.println("Enter your guess ... : ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if(number > targetNumber){
                System.out.println("Oops.. too high.");
                score ++;
            }else if(number < targetNumber){
                System.out.println("Oops.. too low.");
                score ++;
            }else {
                System.out.println("Congratulations, your guess is correct.");
                System.out.println("Number of incorrect attempts = " + score);
                win = true;
            }
        }while(!win);
    }
}
