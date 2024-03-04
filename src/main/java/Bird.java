public class Bird {

    private String species;
    private String color;
    private boolean canFly;

    public Bird(String str, String col, boolean cf) {
        species = str;
        color = col;
        canFly = cf;
    }

    // choice A
    public Bird() {
        species = "unknown";
        color = "unknown";
        canFly = false;
    }

    // choice E
    // public Bird(String col, String str, boolean cf) {
    //     species = str;
    //     color = col;
    //     canFly = cf;
    // }
}
