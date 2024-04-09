public class Hello {

    public static void main(String[] args) {
        System.out.println("new dawn, new day");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1: " + singleton1.toString());
        System.out.println("singleton2: " + singleton2.toString());
    }
    
}
