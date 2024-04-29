import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class SkittlesFactoryTest {
    
    @Test
    public void SkittlesFactoryTest() {
        // Create a new skittle 
        Skittles.SkittlesFactory mySkittles = new Skittles.SkittlesFactory();

        // Make sure that the color red gives you the correct type which is strawberry
        Skittles strawberry = mySkittles.getSkittles("red"); 
        assertEquals("Strawberry", strawberry.getType());

         // Make sure that the color yellow gives you the correct type which is lemon
        Skittles lemon = mySkittles.getSkittles("yellow");
        assertEquals("Lemon", lemon.getType());
        
         // Make sure that the color purple gives you the correct type grape
        Skittles grape = mySkittles.getSkittles("purple");
        assertEquals("Grape", grape.getType());
        
         // Make sure that the color orange gives you the correct type which is orange
        Skittles orange = mySkittles.getSkittles("orange");
        assertEquals("Orange", orange.getType());
        
         // Make sure that the color green gives you the correct type which is greenapple
        Skittles GreenApple = mySkittles.getSkittles("green");
        assertEquals("GreenApple", GreenApple.getType());

        // If color is blue make sure that no skittle is created because it does not match what is allowed
        Skittles otherColor = mySkittles.getSkittles("blue");
        assertNull(otherColor);
    }
}

