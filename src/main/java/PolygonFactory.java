public class PolygonFactory {

    //creates methods based on the number of sides for an inputted polygon
    public Polygon getPolygon(int numberOfSides) {
        // if the polygon has 3 sides the triangel method is called
        if(numberOfSides == 3) {
            return new Triangle();
        }
        // if the polygon has 4 sides the square method is called
        if(numberOfSides == 4) {
            return new Square();
        }
        // if the polygon has 5 sides the pentagon method is called
        if(numberOfSides == 5) {
            return new Pentagon();
        } 
        //doesn't include any other types of shapes so it will retun null if any other number
        return null;
    }
}
