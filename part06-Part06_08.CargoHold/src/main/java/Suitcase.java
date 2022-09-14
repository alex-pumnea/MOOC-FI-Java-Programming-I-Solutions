import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxTotalWeight;

    public Suitcase(int maxTotalWeight) {
        this.maxTotalWeight = maxTotalWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxTotalWeight) {
            this.items.add(item);
        }

    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        Item heaviest = new Item("heaviest", 0);
        if (items.size() == 0) {
            return null;
        }
        if (items.size() > 0) {

            for (Item item : this.items) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;
                }
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        String itemFormatted = "";

        if (this.items.size() == 0) {
            itemFormatted = "no items";
            return itemFormatted + " (" + this.totalWeight() + " kg)";
        }

        if (this.items.size() == 1) {
            itemFormatted = "item";
        }

        if (this.items.size() > 1) {
            itemFormatted = "items";
        }

        String printOut = this.items.size() + " " + itemFormatted + " (" + this.totalWeight() + " kg)";

        return printOut;
    }
}
