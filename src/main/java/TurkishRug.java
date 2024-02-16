public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        //Sets emoji unicode
        String emoji = new String(Character.toChars(0x2665));
        // Creates new multidimensional array
        String [][] solid = new String[11][11];
        // Creates for loop for the i position
        for (int i = 0; i < solid.length; i++) {
            // Creates for loop for j position
            for (int j = 0; j < solid.length; j++) {
                // Returns all positions as the set emoji
                solid[i][j] = emoji;
            }
        }
        return solid; 
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // Sets emoji unicodes
        String club = new String(Character.toChars(0x2663));
        String spade = new String (Character.toChars(0x2660));
        // Creates new multidimensional array
        String [][] horizontal = new String [11][11];
        // Creates for loop for i position
        for (int i = 0; i < horizontal.length; i++){
            //Creates for loop for j position
            for (int j = 0; j < horizontal.length; j++) {
                // If i is even the club emoji is returned
                if (i % 2 == 0){
                    horizontal[i][j] = club;
                    // If odd the spade emoji is returned
                } else {
                    horizontal [i][j] = spade;
                }
            }
        }
        return horizontal;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        // New multidiemnional array created
        String [][] vertical = new String [11][11];
        // New string created for unicodes
        String club = new String (Character.toChars(0x2663));
        String spade = new String (Character.toChars(0x2660));
        // For loop created for i position
        for (int i = 0; i < vertical.length; i++) {
            // For loop created for j position
            for (int j = 0; j < vertical.length; j++) {
                // If j is even the club emoji is returned
                if (j % 2 ==0) {
                    vertical[i][j] = club;
                    // If odd the spade emoji is returned
                } else {
                    vertical[i][j] = spade;
                }
            }
        }
        return vertical;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // New multidimensional array created
        String [][] diagonal = new String [11][11];
        // New Strings created with unicode values
        String sun = new String (Character.toChars(0x1F31E));
        String moon = new String (Character.toChars(0x1F31D));
        // For loop created to keep track of i position
        for (int i = 0; i < diagonal.length; i ++) {
            // For loop created to keep track of j position
            for (int j = 0; j < diagonal.length; j++) {
                // Set all initial values to the sun emoji
                diagonal[i][j] = sun;
                // If both i and j are even the moon emoji is returned
                if (i % 2 == 0 && j % 2 == 0) { 
                    diagonal[i][j] = moon; 
                }
                // If both i and j are odd the moon emoji is returned 
                if (i % 2 != 0 && j % 2 != 0) {
                    diagonal[i][j] = moon;
                }
            }
        }
        return diagonal; 
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // New multidimensional array created
        String [][] plaid = new String [11][11];
        // New String created to set unicode values
        String dragon = new String (Character.toChars(0x1F432));
        String rabbit = new String (Character.toChars(0x1F430));
        // For loop created to keep track of i value
        for (int i = 0; i < plaid.length; i ++) {
            // For loop created to keep track of j value
            for (int j = 0; j < plaid.length; j++) {
                // If both i and j are even the dragon emoji is returned
                if (i % 2 == 0 && j % 2 == 0) { 
                    plaid[i][j] = dragon;
                    // If i and j are not both even the rabbit is returned 
                } else {
                    plaid[i][j] = rabbit;
                }
            }
        }
        return plaid; 
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // New multidimensional array created
        String [][] argyle = new String[11][11];
        // New Strings created for unicode values 
        String balloon = new String (Character.toChars (0x1F388));
        String hand = new String (Character.toChars(0x270B));
        // For loop created to keep track of i position
        for (int i = 0; i < argyle.length; i ++) {
            // For loop created to keep track of j position
            for (int j = 0; j < argyle.length; j ++) {
                // The argyle array is set to return the hand emoji
                argyle [i][j] = hand;
                // If the i and j positions are equivalent the balloon emoji is returned
                if (i == j) {
                    argyle[i][j] = balloon;
                }
                // If j is equal to the array length minus 1 minus the i position return balloon
                if (j == 11 - 1 - i) {
                    argyle [i][j] = balloon;
                }
                // If j is equal to the length divided by two plus i then return balloon
                if (j == 11/2 + i) {
                    argyle[i][j] = balloon;
                }
                // If j is equal to the length divided by two minus i then return balloon
                if (j == 11/2 - i) {
                    argyle[i][j] = balloon;
                }
                // If i is equal to the length divided by two plus j return balloon
                if (i == 11/2 + j) {
                    argyle [i][j] = balloon;
                }
                // If i plus j equals 15 return balloon
                if (i + j  == 15) {
                    argyle[i][j] = balloon;
                }
            }
        }
        return argyle;
    }
}
