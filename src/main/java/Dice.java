import java.util.Random;

public class Dice {

    private int numberOfsides;
    private int numberOfDice;


    public Dice() {
        this.numberOfDice = 2;
        this.numberOfsides = 6;
    }

    public Dice(int numberOfsides, int numberOfDice) {
        this.numberOfsides = numberOfsides;
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfsides() {
        return numberOfsides;
    }

    public void setNumberOfsides(int numberOfsides) {
        this.numberOfsides = numberOfsides;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++){
            Random random = new Random();
            sum += random.nextInt(numberOfsides + 1);
        }
        return sum;
    }
}
