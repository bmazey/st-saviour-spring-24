import org.junit.jupiter.api.Test;

public class JewelryBuilderTest {

    @Test
    public void TestJewelryBuilder() {
        // create a jewelry object
        Jewelry myJewelry = new Jewelry.JewelryBuilder()
            .whatCategory("bracelet")   // make the jewelry category bracelet
            .withGems("ruby")   // make the gemstone ruby
            .metalType("gold")  // make the metal type gold
            .build();   // build the jewelry object

        assert myJewelry.getMetal().equals("gold"); // check that the metal type is gold
        assert myJewelry.getGemstones().equals("ruby"); // check that the gemstone is a ruby
        assert myJewelry.getCategory().equals("bracelet");  // check that the category is bracelet
    }
}
