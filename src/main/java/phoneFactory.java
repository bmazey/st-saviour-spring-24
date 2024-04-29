public abstract class phoneFactory {
    public Phone create () {
        Phone phone = createPhone();
        phone.build();
        return phone;
    }
    protected abstract Phone createPhone();
}
