public class PolygonFactory {
    // sets up a factory that takes the number of sides as an argument
    public Polygon getPolygon(int numberOfSides) {
        // returns the instance of triange if the number of sides is 3
        if(numberOfSides == 3) {
            return new Triangle();
        }
        // returns the instance of square if the number of sides is 4
        if(numberOfSides == 4) {
            return new Square();
        }
        // returns the instance of pentagon if the number of sides is 5
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        // returns nothing if the number of sides does not match an instance
        return null;
        
    }
}
