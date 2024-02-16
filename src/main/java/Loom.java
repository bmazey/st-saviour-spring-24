public class Loom {
    // creates a method that will print any string array
    public static void main(String[] args) {
        weave(TurkishRug.solid());
        weave(TurkishRug.horizontal());
        weave(TurkishRug.vertical());
        weave(TurkishRug.diagonal());
        weave(TurkishRug.plaid());
        weave(TurkishRug.argyle());
    }
    // Prints a 2D String array.
    public static void weave(String[][] rug) {
        // iterates through each row of the rug
        for (int i = 0; i < rug.length; i++) {
            // iterates through each element in each row of the rug
            for (int j = 0; j < rug[i].length; j++) {
                // prints each element in each row
                System.out.print(rug[i][j]);
            }
            // line break between each row
            System.out.println("");
        }
        // line break between each rug
        System.out.println("");
    }   
}

