public class Counter {
    private int startValue;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.startValue += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.startValue -= decreaseBy;
    }
}
