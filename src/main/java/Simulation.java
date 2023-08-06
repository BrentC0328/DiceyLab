public class Simulation {

    private int numberOfDies;

    private int numberOfTosses;
    private Bins theBin = new Bins();

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        theBin = new Bins();
    }

    public void runSimulation(){

        Dice dice = new Dice(6, 2);

        for (int i = 0; i < 100001; i++){
            int diceRoll = dice.tossAndSum();
            theBin.incrementBin(diceRoll);
        }
        printResults();
    }

    public void printResults(){
        System.out.println( theBin.toString());
    }
}
