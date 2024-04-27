public class Singleton {
    private static Singleton INSTANCE;
    //adds the string 'original info' to a string
    private String info = "original info";

    //creates a method singleton
    private Singleton() {}

    //if nothing exists in the instance of singleton, there will be a new singleton
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    //gets the specific string in info and attackes it to info
    public String getInfo() {
        return this.info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

}
