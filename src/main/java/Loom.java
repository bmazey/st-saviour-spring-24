public class Loom {

    public static void main(String[] args) {
        weave(TurkishRug.solid());

    }

    public static void main(String[] args) {
        weave(TurkishRug.horizontal());

    }

    // Prints a 2D String array.
    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            System.out.println("");  
        }
    }
}
