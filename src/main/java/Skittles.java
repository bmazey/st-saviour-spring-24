public interface Skittles {
    // method getType returns a String
    String getType();

    public class SkittlesFactory {
        // method getSkittles accepts a String color and returns a skittle flavor
        public Skittles getSkittles(String color) {
            // creates and returns an object of a skittle flavor for each skittle color
            if(color.equals("red")) {
                return new Strawberry();
            } 
            if (color.equals("yellow")) {
                return new Lemon();
            } 
            if(color.equals("purple")) {
                return new Grape();
            } 
            if(color.equals("orange")) {
                return new Orange();
            } 
            if(color.equals("green")) {
                return new GreenApple();
            }
            return null;    // return null if not any of the colors above
        }
    }

    // public class Strawberry implements Skittles interface
    public class Strawberry implements Skittles {
        // Override allows a subclass to implement method from parent classes, in this case getType() returns "Strawberry"
        @Override
        public String getType() {
            return "Strawberry";
        }
    }
    
    // public class Lemon implements Skittles interface
    public class Lemon implements Skittles {
        @Override
        public String getType() {
            return "Lemon"; // getType() returns "Lemon"
        }
    }

    // public class Grape implements Skittles interface
    public class Grape implements Skittles {
        @Override
        public String getType() {
            return "Grape"; // getType() returns "Grape"
        }
    }

    // public class Orange implements Skittles interface
    public class Orange implements Skittles {
        @Override
        public String getType() {
            return "Orange"; // getType() returns "Orange"
        }
    }

    // public class GreenApple implements Skittles interface
    public class GreenApple implements Skittles {
        @Override
        public String getType() {
            return "GreenApple"; // getType() returns "GreenApple"
        }
    }
}
