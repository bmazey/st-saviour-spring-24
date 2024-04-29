import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    
    @Test

    public void TestFactory() {
        Android phone1 = new Android();
        assertEquals(phone1.build(), "Build Android");

        iPhone phone1 = new iPhone();
        assertEquals(phone1.build(), "Build iPhone");
    }
    
}
