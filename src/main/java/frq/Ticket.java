package frq;

public abstract class Ticket {
    
    // Unique ticket ID number.
    private int serialNumber;

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    public static int getNextSerialNumber() {
        // Implementation not shown.
        return 0;
    }
}
