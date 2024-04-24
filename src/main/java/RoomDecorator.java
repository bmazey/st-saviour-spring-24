public abstract class RoomDecorator implements Decorator {
    private Decorator room;

    @Override
    public String decorate() {
        return room.decorate();
    }
}

