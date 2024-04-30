import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    
    @Test
    public void TestFactory() {
        PolygonFactory myFactory = new PolygonFactory();
        Polygon myPolygon = myFactory.getPolygon(3);

        assert myPolygon instanceof Triangle;

        Polygon mySecondPolygon = myFactory.getPolygon(4);

        assert mySecondPolygon instanceof Rectangle;

        Polygon myThirdPolygon = myFactory.getPolygon(5);

        assert myThirdPolygon instanceof Pentagon;
    }
    
}
