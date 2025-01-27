package NumberGuessingGame;

public class GenerateNumber {
    public Range range;
    public GenerateNumber(Range range){
        this.range = range;
    }
    public int generateRandomNumber(){
        int min = range.getMin();
        int max = range.getMax();
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
