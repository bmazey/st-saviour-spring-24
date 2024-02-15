public class Loom {

    public static void main(String[] args) {
        // TODO use this space to print rugs to the console.
        // weave(TurkishRug.solid());
        // System.out.println("");
        // weave(TurkishRug.horizontal());
        // System.out.println("");
        // weave(TurkishRug.vertical());
        // System.out.println("");
        // weave(TurkishRug.diagonal());
        // System.out.println("");
        // weave(TurkishRug.plaid());
        // System.out.println("");
        weave(TurkishRug.argyle());
    }

    // Prints a 2D String array.
    public static void weave(String[][] rug) {
        String [][] pattern = new String[11][11];
        for (int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug.length; j++){
                System.out.print(rug[i][j]);
            }
            System.out.println("");
        }
    }
}
