public class Loom {

    public static void main(String[] args) {
        String[][] rug = new String[11][11];
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "0";
            }
        }

    // Prints a 2D String array.
    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
