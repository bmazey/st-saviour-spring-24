public interface FactoryMethod {
    String getType();
}
Public class ShapeMethod
public Shape getShapeMethod(int numofvertices) {
    if(numofvertices == 3) {
        return new Triangle();
    }
    if(numofvertices == 4) {
        return new Square(); 
    }
    if(numofvertices == 5) {
        return new Pentagon();
    }
    if(numofvertices == 6) {
        return new Hexagon();
    }
    if(numofvertices == 20) {
        return new Decahedron();
    }
    else if (numofvertices == 9) {
        return new Nonagon();
    }
    return null;

}

