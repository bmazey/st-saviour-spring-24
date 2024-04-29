public class Figurines extends RoomDecorator{
    
    // Figurines method created to access decorator() using keyword super
    public Figurines (Decorator room) {
        super(room);
    }

    // method decorate () returns "Room with Figurines"
    public String decorate() {
        return super.decorate() + decorateWithFigurines();
    }

    // method to return what the room is decorated with
    private String decorateWithFigurines() {
        return " with Figurines";
    }
}
