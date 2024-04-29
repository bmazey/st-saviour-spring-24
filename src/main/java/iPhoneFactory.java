public abstract class iPhoneFactory extends phoneFactory {
    
    // creates an instance of an iPhone
    @Override
    protected Phone createPhone() {
        return new iPhone();
    }
}
