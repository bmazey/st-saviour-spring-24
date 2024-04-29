public interface Skittles {
    // An interface allows for a class with abstract methods
    // ( for line 4)What makes the factory special is all the different types of skittles made so to start off
    // create a string type
    String getType();

    public class SkittlesFactory{
        // To have a different type means a different color so you need to create another string that
        //acknowledges the color
        public Skittles getSkittles(String color) {
            // You're telling the system what type matches with what color hence string type & color
            // this applies to line 12-26
            if(color.equals("red")) {
                return new Strawberry();
            }
            if(color.equals("yellow")) {
                return new Lemon();
            }
            if(color.equals("purple")) {
                return new Grape();
            }
            if(color.equals("orange")) {
                return new Orange();
            }
            if(color.equals("green")){
                return new GreenApple();
            }
            // If the color does not match any of the colors above no skittles is produced essentially
            return null;
        }
    }
    // Telling the system that the following 'smaller' class shares something with the main class
    public class Strawberry implements Skittles{
        @Override
        // 'getType' and 'Strawberry' are characterstics of Skittles that is now also apart of class Strawberry
    
        public String getType() {
            return "Strawberry";
            }      
        }
        // 'getType' and 'Lemon' are characterstics of Skittles that is now also apart of class Lemon
        public class Lemon implements Skittles {
            @Override
            public String getType() {
                return "Lemon";
            }
        }
    // 'getType' and 'Grape' are characterstics of Skittles that is now also apart of class Grape
        public class Grape implements Skittles {
            @Override
            public String getType(){
                return "Grape";
            }
        }
     // 'getType' and 'Orange' are characterstics of Skittles that is now also apart of class Orange
        public class Orange implements Skittles {
            @Override
            public String getType(){
                return "Orange";
            }
        }
     // 'getType' and 'Greenapple' are characterstics of Skittles that is now also apart of class Greenapple
        public class GreenApple implements Skittles {
            @Override
            public String getType() {
                return "GreenApple";
            }
        }
        
    }

