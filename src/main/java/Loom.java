public class Loom {

    public static void main(String[] args) {
        // Patterns from TurkishRug implemented into weave array
        weave(TurkishRug.solid());
        // Separates line upon running code
        System.out.println("");
        weave(TurkishRug.horizontal());
        System.out.println("");
        weave(TurkishRug.vertical());
        System.out.println("");
        weave(TurkishRug.diagonal());
        System.out.println("");
        weave(TurkishRug.plaid());
        System.out.println("");
        weave(TurkishRug.argyle());
    }

    // Prints a 2D String array.
    public static void weave(String[][] rug) {
        // Create new array that accepts two string values
        String [][] weave = new String[11][11];
        // Create for loop to keep track of position i 
        for (int i = 0; i < rug.length; i++){
            // Create for loop  to keep track of position j
            for (int j = 0; j < rug.length; j++){
                //Prints out the array
                System.out.print(rug[i][j]);
            }
            // Prints array in 11 by 11 cube.
            System.out.println("");
        }
    }
}
