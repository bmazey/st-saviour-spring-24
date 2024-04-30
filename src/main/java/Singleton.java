public class Singleton {
    private static Singleton INSTANCE;

    // sets up the original information to be returned
    private String info = "original info";

    private Singleton() {}

    // method created to define the INSTANCE if null
    public static Singleton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    // getter method for info
    public String getInfo() {
        return this.info;
    }

    // setter method for info
    public void setInfo (String info){
        this.info = info;
    }
}
