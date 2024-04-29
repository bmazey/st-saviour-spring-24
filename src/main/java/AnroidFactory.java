public class AnroidFactory extends phoneFactory {

    // creates an instance of an Android phone
    @Override
    protected Phone createPhone() {
        return new Android();
    }
}