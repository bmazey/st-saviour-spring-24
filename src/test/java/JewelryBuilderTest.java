import org.junit.jupiter.api.Test;

public class JewelryBuilderTest {

    @Test
    public void TestJewelryBuilder() {
        Jewelry myJewelry = new Jewelry.JewelryBuilder()
            .whatCategory("bracelet")
            .withGems("ruby")
            .metalType("gold")
            .build();

        assert myJewelry.getMetal().equals("gold");
    }
    
}
