
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    private int price() {
        return princePerSquare * squares;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();
    }

}
