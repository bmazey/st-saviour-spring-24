import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void TestSingleton() {
        // Create instances of singleton 
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(singleton1, singleton2);
        // Check to see if they match each other 
        assert singleton1 == singleton2;
        // Use a set and get to double check that they are equal
        singleton1.setInfo("new info just dropped!");

        assert singleton2.getInfo().equals("new info just dropped!");
    }
    
}
