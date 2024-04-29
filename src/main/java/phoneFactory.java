public abstract class phoneFactory {
    
    // method created to build a new phone
    public Phone create () {
        Phone phone = createPhone();
        phone.build();
        return phone;
    }
    // phone protected so method cannot be changed in other classes
    protected abstract Phone createPhone();
}
