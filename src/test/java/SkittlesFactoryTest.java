import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class SkittlesFactoryTest {
    
    @Test
    public void TestSkittlesFactory() {
        // create a SkittlesFactory object
        Skittles.SkittlesFactory mySkittles = new Skittles.SkittlesFactory();

        // test a skittle with the color red and verify that it is strawberry 
        Skittles strawberry = mySkittles.getSkittles("red");
        assertEquals("Strawberry", strawberry.getType());

        // test a skittle with the color yellow and verify that it is lemon
        Skittles lemon = mySkittles.getSkittles("yellow");
        assertEquals("Lemon", lemon.getType());

        // test a skittle with the color purple and verify that it is rape
        Skittles grape = mySkittles.getSkittles("purple");
        assertEquals("Grape", grape.getType());
        
        // test a skittle with the color orange and verify that it is orange 
        Skittles orange = mySkittles.getSkittles("orange");
        assertEquals("Orange", orange.getType());

        // test a skittle with the color green and verify that it is green apple
        Skittles greenApple = mySkittles.getSkittles("green");
        assertEquals("GreenApple", greenApple.getType());

        // test a skittle with the color pink and verify that it returns null
        Skittles otherColor = mySkittles.getSkittles("pink");
        assertNull(otherColor);
    }
}
