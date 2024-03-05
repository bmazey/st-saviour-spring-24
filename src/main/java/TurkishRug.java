public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        // Sets the value of an emoji
        String dangoEmoji = new String(Character.toChars(0x1F361));
        // Sets a 2D String array for the solid rug
        String[][] solidRug = new String[11][11];
        // Fill the array with dango emojis
        for (int i = 0; i < solidRug.length; i++){
            for (int j = 0; j < solidRug[i].length; j++){
                solidRug[i][j] = dangoEmoji;
            }
        }
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String dangoEmoji = new String(Character.toChars(0x1F361));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] horizontalRug = new String[11][11];
        for (int i = 0; i < horizontalRug.length; i++){
            for (int j = 0; j < horizontalRug[i].length; j++){
                // When i is even, the array has dango emojis; otherwise, swirl emojis
                if (i % 2 == 0) {
                    horizontalRug[i][j] = dangoEmoji;
                } else {
                    horizontalRug[i][j] = swirlEmoji;
                }
            }
        }
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String dangoEmoji = new String(Character.toChars(0x1F361));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] verticalRug = new String[11][11];
        for (int i = 0; i < verticalRug.length; i++){
            for (int j = 0; j < verticalRug[i].length; j++){
                // When j is even, the array has dango emojis; otherwise, swirl emojis.
                if (j % 2 == 0) {
                    verticalRug[i][j] = dangoEmoji;
                } else {
                    verticalRug[i][j] = swirlEmoji;
                }
            }
        }
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        String dangoEmoji = new String(Character.toChars(0x1F361));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] diagonalRug = new String[11][11];
        for (int i = 0; i < diagonalRug.length; i++) {
            for (int j = 0; j < diagonalRug[i].length; j++) {
                diagonalRug[i][j] = swirlEmoji;
                // When both i and j are even, the array has dango emojis
                if (i % 2 == 0 && j % 2 == 0) {
                    diagonalRug[i][j] = dangoEmoji;
                }
                // When both i and j are odd, the array has dango emojis
                if (i % 2 != 0 && j % 2 != 0) {
                    diagonalRug[i][j] = dangoEmoji;
                }
            }
        }
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        String dangoEmoji = new String(Character.toChars(0x1F361));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] plaidRug = new String[11][11];
        for (int i = 0; i < plaidRug.length; i++) {
            for (int j = 0; j < plaidRug[i].length; j++) {
                // Sets swirl emoji as default in the array
                plaidRug[i][j] = swirlEmoji;
                // When both i and j are even, the array has dango emojis
                if (i % 2 == 0 && j % 2 == 0) {
                    plaidRug[i][j] = dangoEmoji;
                }
            }
        }
        return plaidRug;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        String dangoEmoji = new String(Character.toChars(0x1F361));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] argyleRug = new String[11][11];
        for (int i = 0; i < argyleRug.length; i++) {
            for (int j = 0; j < argyleRug[i].length; j++) {
                // States the conditions for placing dango emojis to create argyle pattern
                if (i == j) {
                    argyleRug[i][j] = dangoEmoji;
                } else if (i + j == 10) {
                    argyleRug[i][j] = dangoEmoji;
                } else if (i + j == 5) {
                    argyleRug[i][j] = dangoEmoji;
                } else if (j - i == 5) {
                    argyleRug[i][j] = dangoEmoji;
                } else if (i - j == 5) {
                    argyleRug[i][j] = dangoEmoji;
                } else if (i + j == 15) {
                    argyleRug[i][j] = dangoEmoji;
                } else {
                    argyleRug[i][j] = swirlEmoji;
                }
            }
        }
        return argyleRug;
    }
}