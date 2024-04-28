public class Singleton {
    // static inner class holds the instance of Singleton class
    private static Singleton INSTANCE;

    // private data member that stores information
    private String info = "original info";

    // private constructor
    private Singleton() {}

    // getter method to get singleton instance 
    public static Singleton getInstance() {
        // if there is no instance of singleton, make a new instance of singleton
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;    // return the current instance of singleton
    }

    // getter method to get the information stored in singleton
    public String getInfo() {
        return this.info;   
    }

    // setter method to set information in singleton
    public void setInfo(String info) {
        this.info = info;
    } 
}
