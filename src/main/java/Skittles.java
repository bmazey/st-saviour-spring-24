public interface Skittles {
    String getType();

    public class SkittlesFactory{
        public Skittles getSkittles(String color) {
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
            return null;
        }
    }
    
    public class Strawberry implements Skittles{
        @Override
        public String getType() {
            return "Strawberry";
            }      
        }
        
        public class Lemon implements Skittles {
            @Override
            public String getType() {
                return "Lemon";
            }
        }

        public class Grape implements Skittles {
            @Override
            public String getType(){
                return "Grape";
            }
        }

        public class Orange implements Skittles {
            @Override
            public String getType(){
                return "Orange";
            }
        }

        public class GreenApple implements Skittles {
            @Override
            public String getType() {
                return "GreenApple";
            }
        }
        
    }

