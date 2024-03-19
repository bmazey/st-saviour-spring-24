import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusTest2 {
    @Test
    public void WhyWeTravel()
    {
        Detector detector = new Detector("Travel in that sense guides us towards a better balance of wisdom and compassion", 81);


        assertEquals(185, detector.search("Few of us ever forget the connection between travel, \r\n" +
        "And travail, and I know that I travel, \r\n" +
        "In large part in search of hardship, \r\n" +
        "Both my own which I want to feel, and others, \r\n" +
        "Which I need to see. \r\n" +
        "Travel in that sense guides us towards a better balance of wisdom and compassion. " +
        "Of seeing the world clearly, yet feeling it truly."));
    }

} 

