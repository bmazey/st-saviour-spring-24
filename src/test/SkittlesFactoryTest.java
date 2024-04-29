import static org.junit.Jupiter.api.Assertions.assertEquals;
import static org.junit.Jupiter.api.Assertions.assertNull;

import org.junit.Jupiter.api.Test;

public class SkittlesFactoryTest {
    
    @Test
    public void SkittlesFactoryTest() {
        Skittles.SkittlesFactory mySkittles = new Skittles.SkittlesFactory();

        Skittles strawberry = mySkittles.getSkittles("red");
        assertEquals("Strawberry", strawberry.getType());

        Skittles lemon = mySkittles.getSkittles("yellow");
        assertEquals("Lemon", lemon.getType());
        
        Skittles grape = mySkittles.getSkittles("purple");
        assertEquals("Grape", grape.getType());
        
        Skittles orange = mySkittles.getSkittles("orange");
        assertEquals("Orange", orange.getType());
        
        Skittles GreenApple = mySkittles.getSkittles("green");
        assertEquals("GreenApple", greenApple.getType());

        Skittles otherColr = mySkittles.getSkittles("blue");
        assertNull(otherColor);
    }
}

