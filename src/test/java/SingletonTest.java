import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void TestSingleton() {
        // instances of singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // check if the instances singleton1 and singleton2 are equal
        assertEquals(singleton1, singleton2);

        // check if singleton1 and singleton2 are the same instance
        assert singleton1 == singleton2;

        // set new information to singleton1
        singleton1.setInfo("new info just dropped!");

        // check if singleton2 got new information
        assert singleton2.getInfo().equals("new info just dropped!");
    }
}
