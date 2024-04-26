import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void TestSingleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(singleton1, singleton2);

        assert singleton1 == singleton2;

        singleton1.setInfo("new info just dropped!");

        assert singleton2.getInfo().equals("new info just dropped!");
    }
}
