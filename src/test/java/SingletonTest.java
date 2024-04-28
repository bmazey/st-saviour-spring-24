import org.junit.jupiter.api.Test;

public class SingletonTest {


    @Test
    public static void TestSingleton() {
        // Get instance of singleton class
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance(); 
        // Assert both instances
        assert singleton1 == singleton2; 
    
        singleton1.setInfo("new info just dropped!");
        assert singleton2.getInfo().equals("new info just dropped!");
    }
}
