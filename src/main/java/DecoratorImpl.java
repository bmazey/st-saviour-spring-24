public class DecoratorImpl implements Decorator {
    
    // Override command used to define decorate method to return "Room"
    @Override
    public String decorate() {
        return "Room";
    }
}
