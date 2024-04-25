import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecoratorTest {
    
    @Test
    public void whenDectoratorInjectedAtRuntime_thenConfigSuccess() {
        Decorator room1 = new FairyLights (new DecoratorImpl());
        assertEquals(room1.decorate(), "Room with Fairy Lights");

        Decorator room2 = new Figurines (new DecoratorImpl());
        assertEquals(room2.decorate(), "Room with Figurines");
    }
}
