import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void TestSinlgeton() {
        // sets up two instances of singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // asserts that the instances are ewual
        assertEquals(singleton1, singleton2);

        assert singleton1 == singleton2;
        // Sets the info of singleton1
        singleton1.setInfo("new info just dropped!");
        
        // gets the info of singleton2 and asserts that it is equual to singleton1
        assert singleton2.getInfo().equals("new info just dropped!");
    }
    
}
