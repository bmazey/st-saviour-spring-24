public class PolygonFactory {
    public class PolygonFactory {
        public Polygon getPolygon(int numberOfSides) {
            if(numberOfSides == 6) {
                return new Hexagon();
            }
            if(numberOfSides == 4) {
                return new Square();
            }
            if(numberOfSides == 9) {
                return new Nonagon();
            }
            if(numberOfSides == 10) {
                return new Decagon();
            }
            else if(numberOfSides == 8) {
                return new Octagon();
            }
            return null;
        }
    }

}
