public class Singleton {
    // creates an inner class which holds the instance of singleton
    private static Singleton INSTANCE;
    // initializes the variable info
    private String info = "original info";

    private Singleton() {}
    // creates the instance if it does not already exist
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    // gets the value of info
    public String getInfo() {
        return this.info;
    }
    // sets the value of info
    public void setInfo(String info) {
        this.info = info;
    }
}
