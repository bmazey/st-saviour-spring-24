public class iPhone implements Phone {

    // build() overridden to print what phone is built
    @Override
    public void build() {
        System.out.println ("Build iPhone");
    }
}