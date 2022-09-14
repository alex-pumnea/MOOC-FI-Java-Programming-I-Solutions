import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int getSuitcasesTotalWeight() {
        int suitcasesTotalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            suitcasesTotalWeight += suitcase.totalWeight();
        }
        return suitcasesTotalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (getSuitcasesTotalWeight() + suitcase.totalWeight() > maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.getSuitcasesTotalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.getSuitcasesTotalWeight() + " kg)";
    }

}
