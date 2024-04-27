import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PolygonFactoryTest {

    @Test
    public void TestPolygonFactory() {
        //creates a polygon which is unclassified
        PolygonFactory myFactory = new PolygonFactory();
        //this polygon contains 3 sides
        Polygon myPolygon = myFactory.getPolygon(3);

        //asserts that the polygon 'myPolygon' will be classified as a triangle
        assert myPolygon instanceof Triangle;

        //this polygon contains 4 sides
        Polygon mySecondPolygon = myFactory.getPolygon(4);

        //asserts that the polygon 'mySecondPolygon' will be classified as a square
        assert mySecondPolygon instanceof Square;

        //this polygon contains 5 sides
        Polygon myThirdPolygon = myFactory.getPolygon(5);

        //asserts that the polygon 'myThirdPolygon' will be classified as a pentagon
        assert myThirdPolygon instanceof Pentagon;

        //creates a list of polygons
        ArrayList<Polygon> shapes = new ArrayList<Polygon>();

        //adds myPolygon and mySecondPolygon to the list
        shapes.add(myPolygon);
        shapes.add(mySecondPolygon);

        //prints their types: Triangle and Square
        for (Polygon p: shapes) {
            System.out.println(p.getType());
        }
        
    }

}
