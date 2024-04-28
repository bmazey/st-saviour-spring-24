public class Singleton {
    // Private static instance
    private static Singleton INSTANCE; 

    private String info = "original info";
    // constructer
    private Singleton() {}

    public static Singleton getInstance() {
        // If the instance does not exist create one.
        if (INSTANCE == null){
            INSTANCE = new Singleton();
     }
     return INSTANCE; 
    }
    // Method to get information
    public String getInfo(){
        return this.info;
    }
    // Method to set information
    public void setInfo(String info){}

    
}
