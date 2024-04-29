public class  Singleton {
    //Allow for an instance to be created from a class
    private static Singleton INSTANCE;
    //Create a string for information which is not able to be called by other classes
    private String info = "original info";

    private Singleton() {}
    // Calling your instance and using a setter and getter
    public static Singleton getInstance() {
        //Asking the system if there is no instance 
        if(INSTANCE == null) {
            //Since there is no instance of Singleton then you return the original Singleton
            INSTANCE = new Singleton();
        }
        //otherwise you get the instance
        return INSTANCE;
    }
    // Creating setters and getters for lines 19 - 24 and using key word 'this' to refer to the setter 
    // and getter info 
    public String getInfo() {
        return this.info;
    }
    public void setInfo(String info) {
        this.info = info;

    }
}
