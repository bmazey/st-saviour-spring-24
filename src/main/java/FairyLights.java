public class FairyLights extends RoomDecorator {
    
    // FairyLights method created to access decorator() using keyword super
    public FairyLights (Decorator room) {
        super(room);
    }

    // method decorate () returns "Room with Fairy Lights"
    public String decorate() {
        return super.decorate() + decorateWithFairyLights();
    }

    // method to return what the room is decorated with
    private String decorateWithFairyLights() {
        return " with Fairy Lights";
    }
}
