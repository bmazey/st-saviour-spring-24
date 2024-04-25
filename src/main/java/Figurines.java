public class Figurines extends RoomDecorator{
    
    public Figurines (Decorator room) {
        super(room);
    }

    public String decorate() {
        return super.decorate() + decorateWithFigurines();
    }

    private String decorateWithFigurines() {
        return " with Figurines";
    }
}
