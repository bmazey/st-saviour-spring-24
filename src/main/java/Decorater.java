public class Decorater {
    interface Cake {
        String getDescription();
        double getCost();
    }
    
    // Concrete component
    class BasicCake implements Cake {
        @Override
        public String getDescription() {
            return "Basic cake";
        }
    
        @Override
        public double getCost() {
            return 10.0;
        }
    }
    
    // Decorator
    abstract class CakeDecorator implements Cake {
        protected Cake cake;
    
        public CakeDecorator(Cake cake) {
            this.cake = cake;
        }
    
        @Override
        public String getDescription() {
            return cake.getDescription();
        }
    
        @Override
        public double getCost() {
            return cake.getCost();
        }
    }
    
    // Concrete decorators
    class ChocolateFrosting extends CakeDecorator {
        public ChocolateFrosting(Cake cake) {
            super(cake);
        }
    
        @Override
        public String getDescription() {
            return cake.getDescription() + " with Chocolate Frosting";
        }
    
        @Override
        public double getCost() {
            return cake.getCost() + 5.0;
        }
    }
    
    class Sprinkles extends CakeDecorator {
        public Sprinkles(Cake cake) {
            super(cake);
        }
    
        @Override
        public String getDescription() {
            return cake.getDescription() + " with Sprinkles";
        }
    
        @Override
        public double getCost() {
            return cake.getCost() + 2.0;
        }
    }
        
}
