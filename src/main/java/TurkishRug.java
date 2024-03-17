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
        for (int i = 0; i < solidRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j < solidRug[i].length; j++) {
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
        for (int i = 0; i< horizontalRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< horizontalRug[i].length; j++) {
                // if the value of i is even, so every other row, the j values in that 
                // row are the sun emoji
                if (i%2 == 0) {
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
        for (int i = 0; i< verticalRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< verticalRug[i].length; j++) {
                // if the value of j is even, so every other column, the elements in that 
                // row are the sun emoji
                if (j%2 == 0) {
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
        // assigns emojis to the variables sunemoji and moonemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        // sets up an array with a length and width of 11
        String[][] diagonalRug = new String [11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i< diagonalRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< diagonalRug[i].length; j++){
                // if the i and j values at an element are  neither both odd or both even,
                // that element is the sun emoji
                if (i%2 == 0 ^ j%2 == 0) {
                    diagonalRug[i][j] = sunemoji;
                // if the i and j values at an element are both odd or both even,
                // that element is the moon emoji
                } else {
                    diagonalRug[i][j] = moonemoji;
                }
            }
        }
        // returns the completed rug
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // assigns emojis to the variables sunemoji and moonemoji
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        // sets up an array with a length and width of 11
        String[][] plaidRug = new String [11][11];
        // iterates through the i values, or each row of the rug
        for (int i = 0; i< plaidRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< plaidRug[i].length; j++) {
                // if the i and j values at an element are both even, that element is the sun emoji
                if (i%2 == 0 && j%2 == 0) {
                    plaidRug[i][j] = sunemoji;
                // if one or both of the i and j vlaues are off, that element is the moon emoji
                } else {
                    plaidRug[i][j] = moonemoji;
                }
            }
        }
        // returns the completed rug
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
        for (int i = 0; i< argyleRug.length; i++) {
            // iterates through the j values, or each element in each row of the rug
            for (int j = 0; j< argyleRug[i].length; j++) {
                // if the i and j values at an element add up to 10, it is the sun emoji
                if (i + j == 10) {
                    argyleRug[i][j] = sunemoji;
                // if the i and j values are the same, it is the sun emoji
                } else if ( i == j) {
                    argyleRug[i][j] = sunemoji;
                // if anything else, it is the moon emoji
                } else {
                    argyleRug[i][j] = moonemoji;
                }
            }
        }
        // iterates trough the i values in the first half of the rug
        for (int i = 0; i < argyleRug.length / 2 + 1; i++) {
            // beginning halfway down the rug, each element where j is equal to the 
            // length of the rug divided by 2 plus or minus i is the sun emoji. 
            // this creates the top half of the diamond. 
            argyleRug[i][argyleRug.length / 2 - i] = sunemoji;
            argyleRug[i][argyleRug.length / 2 + i] = sunemoji;

            // beginning at the bottom of the rug, each element where i is equal to the length of
            // the rug minus 1 minue i and j is equal to the length of the rug divided by 2 plus or
            // minus i. this creates the bottom half of the diamond. 
            argyleRug[(argyleRug.length - 1) - i][argyleRug.length / 2 - i] = sunemoji;
            argyleRug[(argyleRug.length - 1) - i][argyleRug.length / 2 + i] = sunemoji;
        } 
        // returns the completed rug. 
        return argyleRug;
    }
}
