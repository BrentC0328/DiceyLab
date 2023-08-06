import java.util.LinkedHashMap;

public class Bins {


    private LinkedHashMap<Integer, Integer> theBins;

    public Bins() {
        this.theBins = new LinkedHashMap<>();

        for (int i = 0; i < 11; i++){
            theBins.getOrDefault(i + 2, 0);
        }
    }

    public void incrementBin(Integer binToIncrement){
        int binIndex = binToIncrement - 2;
        theBins.put(binIndex, theBins.get(binIndex) + 1);
    }

    public Integer numberOfRollsInBin(Integer binToCheck){
        return theBins.get(binToCheck - 2);
    }

    @Override
    public String toString() {
        return "Bins{" +
                "theBins=" + theBins +
                '}';
    }
}
