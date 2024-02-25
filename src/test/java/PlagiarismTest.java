import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlagiarismTest {

    @Test
    public void FirstEssay() {
        Detector detector = new Detector("test", 101);

        assertEquals(9, detector.search("a simple test"));
    }

    @Test
    public void SecondEssay() {

    }

    @Test
    public void ThirdEssay() {

    }
    
}
