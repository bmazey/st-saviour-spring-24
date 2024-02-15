public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // emojis to use:
    // pink flower: U+1F338
    // yellow flower: U+1F33C
    // moon: U+1F31A
    // sun: U+1F31E


    // Creates a solid 2D String array.
    public static String[][] solid() {
        // assigns an emoji to the variable sunemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        // sets up an array with a length and width of 11
        String[][] solidRug = new String[11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i < solidRug.length; i++){
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j < solidRug[i].length; j++){
                // assigns the sun emoji at each position
                solidRug[i][j] = sunemoji;
            }
        }
        // returns the completed rug
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // assigns emojis to the variables sunemoji and moonemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        // sets up an array with a length and width of 11
        String[][] horizontalRug = new String [11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i< horizontalRug.length; i++){
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< horizontalRug[i].length; j++){
                // if the value of i is even, so every other row, the j values in that 
                // row are the sun emoji
                if (i%2 == 0){
                    horizontalRug[i][j] = sunemoji;
                // if the value of i is odd, so every other row, the j values in that 
                // row are the moon emoji
                } else {
                    horizontalRug[i][j] = moonemoji;
                }
            }
        }
        // returns the completed rug
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        // assigns emojis to the variables sunemoji and moonemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        // sets up an array with a length and width of 11
        String[][] verticalRug = new String [11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i< verticalRug.length; i++){
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< verticalRug[i].length; j++){
                // if the value of j is even, so every other column, the elements in that 
                // row are the sun emoji
                if (j%2 == 0){
                    verticalRug[i][j] = sunemoji;
                // if the value of j is odd, so every other column, the elements in that 
                // row are the moon emoji
                } else {
                    verticalRug[i][j] = moonemoji;
                }
            }
        }
        // returns the completed rug
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        String[][] diagonalRug = new String [11][11];
        for (int i = 0; i< diagonalRug.length; i++){
            for (int j = 0; j< diagonalRug[i].length; j++){
                if (i%2 == 0 ^ j%2 == 0){
                    diagonalRug[i][j] = sunemoji;
                } else {
                    diagonalRug[i][j] = moonemoji;
                }
            }
        }
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        String[][] plaidRug = new String [11][11];
        for (int i = 0; i< plaidRug.length; i++){
            for (int j = 0; j< plaidRug[i].length; j++){
                if (i%2 == 0 && j%2 == 0){
                    plaidRug[i][j] = sunemoji;
                } else {
                    plaidRug[i][j] = moonemoji;
                }
            }
        }
        return plaidRug;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // assigns emojis to the variables sunemoji and moonemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        // sets up an array with a length and width of 11
        String[][] argyleRug = new String [11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i< argyleRug.length; i++){
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< argyleRug[i].length; j++){
                // if the value of i is even, so every other row, the j values in that 
                // row are the sun emoji
                if (i + j == 10){
                    argyleRug[i][j] = sunemoji;
                // if the value of i is odd, so every other row, the j values in that 
                // row are the moon emoji
                } else if ( i == j){
                    argyleRug[i][j] = sunemoji;
                } else {
                    argyleRug[i][j] = moonemoji;
                }
            }
        }
        for (int k = 0; k < argyleRug.length / 2 + 1; k++){
            // iterates through the j values, or each element in each row of the rug
            argyleRug[k][argyleRug.length / 2 - k] = sunemoji;
            argyleRug[k][argyleRug.length / 2 + k] = sunemoji;

            argyleRug[(argyleRug.length - 1) - k][argyleRug.length / 2 - k] = sunemoji;
            argyleRug[(argyleRug.length - 1) - k][argyleRug.length / 2 + k] = sunemoji;
        } 
        return argyleRug;
    }
}
