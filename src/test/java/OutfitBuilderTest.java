import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class OutfitBuilderTest {

    @Test
    void TestOutfitBuilder() {
        //creates a variable myOutfit
        //enters specific pieces into the shirt, pants, and shoes categories
        Outfit myOutfit = new Outfit.Builder()
          .Shirt("t-shirt")
          .Pants("blue jeans")
          .Shoes("Adidas")
          .build();

        
        /**asserts that the builder runs as expected and the inputted values will be returned when
         * build is called 
        **/
        assertEquals("t-shirt", myOutfit.getShirt());
        assertEquals("blue jeans", myOutfit.getPants());
        assertEquals("Adidas", myOutfit.getShoes());
    }
}