public class PaymentCard {
    private double balance;
    private final double affordable;
    private final double heartly;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.60;
        this.heartly = 4.60;
    }

    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }

    }

    public void eatHeartily() {
        if (this.balance >= heartly) {
            this.balance -= heartly;
        }

    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
