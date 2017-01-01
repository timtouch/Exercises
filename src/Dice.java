/**
 * Created by Timothy on 1/1/2017.
 */
public class Dice{
    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public int roll(){
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum +=  (int)(Math.random()*6 + 1);
        }
        return sum;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    private int numberOfDice;
}
