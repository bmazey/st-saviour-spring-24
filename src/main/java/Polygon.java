public class Polygon {
    public interface Poly {
        String getType();
    }

    public Poly getPoly (int numofSides) {
        if (numofSides == 3) {
            return new Triangle();
        }

        if (numofSides == 4) {
            return new Quadrilateral();
        }

        if (numofSides == 5) {
            return new Pentagon();
        }
        return null;
    }
}
