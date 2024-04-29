import org.junit.jupiter.api.Test;

public class JewleryBuilderTest {
    @Test
    public void testJewleryBuilder () {

        JewleryBuilder comp = new JewleryBuilder.JewleryBuilderBuild (
            2, "wood").setBraclet(false)
            .setNecklace(true).setRing(false).build();
        assert comp.isNecklace();
        assert !comp.isBracklet();
    }
}
