public class FairyLights extends RoomDecorator {
    
    public FairyLights (Decorator room) {
        super(room);
    }

    public String decorate() {
        return super.decorate() + decorateWithFairyLights();
    }

    private String decorateWithFairyLights() {
        return " with Fairy Lights";
    }
}
