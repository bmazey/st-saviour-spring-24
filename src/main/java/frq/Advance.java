package frq;

public class Advance extends Ticket {

    private int days;

    public Advance(int days) {
        this.days = days;
    }

    public double getPrice() {
        if (this.days >= 10) {
            return 30.0;
        }
        return 40.0;
    }
}
