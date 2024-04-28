import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PolygonFactoryTest {
    
    @Test
    public void TestPolygonFactory() {
        // creates variable myfactory
        PolygonFactory myFactory = new PolygonFactory();
        // enters specific numbers of sides
        Polygon myPolygon = myFactory.getPolygon(3);
        // asserts that the returned polygon is what is expected
        assert myPolygon instanceof Triangle;

        Polygon mySecondPolygon = myFactory.getPolygon(4);

        assert mySecondPolygon instanceof Square;

        Polygon myThirdPolygon = myFactory.getPolygon(5);

        assert myThirdPolygon instanceof Pentagon;

        ArrayList<Polygon> shapes = new ArrayList<Polygon>();

        shapes.add(myPolygon);
        shapes.add(mySecondPolygon);

        for (Polygon p: shapes) {
            System.out.println(p.getType());
        }
    }
}
