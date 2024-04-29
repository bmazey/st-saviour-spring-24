import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class FactoryTest {

   @Test
   public void testShapeFactory() {
//establishing a factory class that there can be instances of 
      ShapeFactory myFactory = new ShapeFactory();

      Shape myShape = myFactory.getShape(3);

      assert myShape instanceof Triangle;

      Shape mySecondShape = myFactory.getShape(4);

      assert mySecondShape instanceof Square;

      ArrayList<Shape> shapes = new ArrayList<Shape>();

      shapes.add(myShape);
      shapes.add(mySecondShape);
      
   }

}
