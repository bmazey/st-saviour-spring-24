import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class OutfitBuilderTest {

    @Test
    void TestOutfitBuilder() {
        //creates variable myOutfit
        Outfit myOutfit = new Outfit.Builder()
            // puts in specific examples of each of the categories
            .Shirt("t-shirt")
            .Pants("blue jeans")
            .Shoes("Adidas")
            .build();
        // asserts that the expected outputted values for each category will be returned
        assertEquals("t-shirt", myOutfit.getShirt());
        assertEquals("blue jeans", myOutfit.getPants());
        assertEquals("Adidas", myOutfit.getShoes());
        
    }
    
}
