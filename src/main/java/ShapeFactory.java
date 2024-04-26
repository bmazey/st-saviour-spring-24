public class ShapeFactory {

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
