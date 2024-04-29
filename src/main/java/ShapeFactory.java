public class ShapeFactory {
//establishing the parameters for each shape
    public Shape getShape(int numOfVertices) {
        if (numOfVertices == 3) {
            return new Triangle();
        }
        if (numOfVertices == 4) {
            return new Square(); 
        }
        if (numOfVertices == 5) {
            return new Pentagon();
        }
        return null;
    }
}
