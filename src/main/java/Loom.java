public class Loom {

    public static void main(String[] args) {
        weave(TurkishRug.solid());
        weave(TurkishRug.horizontal());
        weave(TurkishRug.diagonal());
        weave(TurkishRug.vertical());
        weave(TurkishRug.plaid());
        weave(TurkishRug.argyle());
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
