public class PolygonFactory {
    public Polygon getPolygon(int numberofSides) {
        //creates different instances of Polygons depending on the amount of sides
        if(numberofSides == 3) {
            return new Triangle();
        }
        if(numberofSides == 4) {
            return new Rectangle();
        }
        if(numberofSides == 5) {
            return new Pentagon();
        }
        //returns null if none are applicable
        return null;
    }
}
