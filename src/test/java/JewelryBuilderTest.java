import org.junit.jupiter.api.Test;

public class JewelryBuilderTest {

    @Test
    public void TestJewelryBuilder() {
        // Make a new jewelry 
        Jewelry myJewelry = new Jewelry.JewelryBuilder()
        .whatCategory("bracelet") // identify and creat the category 
        .withGems("ruby") // identify and create the gemstones used
        .metalType("gold") // identify and create the metal used
        .build(); // build

        assert myJewelry.getMetal().equals("gold"); // check that result metal type matches
        assert myJewelry.getGemstones().equals("ruby"); // check that gemstones matches
        assert myJewelry.getCategory().equals("bracelet"); // check that category matches
    }
}
