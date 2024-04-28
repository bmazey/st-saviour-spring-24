import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testCarBuilder() {
        // Create a car
        Car car = new Car.Builder("Toyota", "Corolla")
                                .year(2022)
                                .color("red")
                                .id("1234")
                                .build();
        // Check car properties
        assertEquals("Toyota", car.Brand());
        assertEquals("Corolla", car.Model());
        assertEquals(2022, car.Year());
        assertEquals("red", car.Color());
        assertEquals("1234", car.Id());
    }
}

    
    
     

