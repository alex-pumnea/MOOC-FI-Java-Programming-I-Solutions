public class Container {

    private int currentAmount;

    public Container() {
        this.currentAmount = 0;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if (amount >= 0) {
            if ((currentAmount + amount) <= 100) {
                this.currentAmount += amount;
            } else {
                this.currentAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if ((currentAmount - amount) >= 0) {
                this.currentAmount -= amount;
            } else {
                this.currentAmount = 0;
            }
        }
    }

    public String toString() {
        return this.currentAmount + "/" + "100";
    }
}
