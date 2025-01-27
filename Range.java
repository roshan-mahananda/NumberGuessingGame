package NumberGuessingGame;

public class Range {
    int minRange;
    int maxRange;
    public Range(int minRange, int maxRange){
        this.minRange = minRange;
        this.maxRange = maxRange;
    }
    public int getMin(){
        return minRange;
    }
    public int getMax(){
        return maxRange;
    }
}
