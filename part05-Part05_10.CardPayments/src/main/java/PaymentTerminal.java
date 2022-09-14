
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }

    public double eatAffordably(double payment) {

        if (payment < AFFORDABLE_PRICE) {
            return payment;
        }
        this.money += AFFORDABLE_PRICE;
        this.affordableMeals++;
        return payment - AFFORDABLE_PRICE;
    }

    public double eatHeartily(double payment) {

        if (payment < HEARTY_PRICE) {
            return payment;
        }
        this.money += HEARTY_PRICE;
        this.heartyMeals++;
        return payment - HEARTY_PRICE;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (!card.takeMoney(AFFORDABLE_PRICE)) {
            return false;
        }

        this.affordableMeals++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (!card.takeMoney(HEARTY_PRICE)) {
            return false;
        }

        this.heartyMeals++;
        return true;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
