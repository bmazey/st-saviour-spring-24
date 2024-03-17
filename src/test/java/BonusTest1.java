import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusTest1 {

    @Test
    public void NothingGoldCanStay() {
        Detector detector = new Detector("So dawn goes down to day", 79);

        assertEquals(160, detector.search("Nature's first green is gold,\r\n" + 
                        "Her hardest hue to hold.\r\n" +
                        "Her early leaf's a flower;\r\n" +
                        "But only so an hour.\r\n" +
                        "Then leaf subsides to leaf.\r\n" +
                        "So Eden sank to grief,\r\n" +
                        "So dawn goes down to day." +
                        "Nothing gold can stay."));
    }
}