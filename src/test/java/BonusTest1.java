import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusTest1 {
    @Test
    public void YoungandBeautiful()
    {
        Detector detector = new Detector("Will you still love me when I'm no longer young", 79);

        assertEquals(228, detector.search("I've seen the world, done it all, had my cake now \r\n" +
        "Diamonds, brilliant, and Bel Air now \r\n" +
        "Hot summer nights, mid-July \r\n" +
        "When you and I were forever wild \r\n" +
        "The crazy days, city lights \r\n" +
        "The way you'd play with me like a child \r\n" +
        "Will you still love me when I'm no longer young and beautiful? \r\n" +
        "Will you still love me when I got nothing but my aching soul? \r\n" +
        "I know you will, I know you will, I know that you will \r\n" +
        "Will you still love me when I'm no longer beautiful?"));
    }
    
}
