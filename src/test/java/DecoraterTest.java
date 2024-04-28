public class DecoraterTest {
    public static class CakeShop {
        public static void main(String[] args) {
            // Create a basic cake
            Cake cake = new BasicCake();
    
            // Add frosting and sprinkles
            cake = new ChocolateFrosting(cake);
            cake = new Sprinkles(cake);
    
            // Output description and cost
            System.out.println("Description: " + cake.getDescription());
            System.out.println("Cost: $" + cake.getCost());
        }
    }
     
}
