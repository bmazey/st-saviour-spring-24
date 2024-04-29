public class  Singleton {
    private static Singleton INSTANCE;

    private String info = "original info";

    private Singleton() {}

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            return new Singleton();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return this.info;
    }
    public void setInfo(String info) {
        this.info = info;

    }
}
