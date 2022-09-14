
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int getEuros() {
        return euros;
    }

    public int getCents() {
        return cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros, this.cents); // create a new Money object that has the correct worth
        newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        Money newMoney = new Money(this.euros, this.cents);
        if (newMoney.euros < compared.euros) {
            return true;
        }
        if (newMoney.euros == compared.euros && newMoney.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser){
        
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
        
        if(cents < 0){
            euros -= 1;
            cents += 100;
        }
        
        if(euros < 0){
            return new Money(0, 0);
        }
        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
