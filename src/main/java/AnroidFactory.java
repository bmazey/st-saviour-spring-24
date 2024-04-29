public class AnroidFactory extends phoneFactory {

    @Override
    protected Phone createPhone() {
        return new Android();
    }
}