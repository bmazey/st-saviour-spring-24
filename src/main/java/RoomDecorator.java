public abstract class RoomDecorator implements Decorator {
    
    // Sets up the private method room
    private Decorator room;

    // constructor method for room
    public RoomDecorator (Decorator room) {
        this.room = room;
    }

    // overrides decorate to return what the room is decorated with
    @Override
    public String decorate() {
        return room.decorate();
    }
}

