import org.junit.jupiter.api.Test;

public class JewleryBuilderTest {

    @Test
	public void testJewleryBuilder() {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		JewleryBuilder comp = new JewleryBuilder.JewleryBuilderBuild(
				2, "wood").setBracelet(false)
				.setNecklace(true).setRing(false).build();

        assert comp.isNecklace();
        assert !comp.isBracelet();

	}

}
