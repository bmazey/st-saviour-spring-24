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
        
        String sunemoji = new String(Character.toChars(0x1F31E));
        String[][] solidRug = new String[11][11];
        for (int i = 0; i < solidRug.length; i++){
            for (int j = 0; j < solidRug[i].length; j++){
                solidRug[i][j] = sunemoji;
            }
        }
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        String[][] horizontalRug = new String [11][11];
        for (int i = 0; i< horizontalRug.length; i++){
            for (int j = 0; j< horizontalRug[i].length; j++){
                if (i%2 == 0){
                    horizontalRug[i][j] = sunemoji;
                } else {
                    horizontalRug[i][j] = moonemoji;
                }
            }
        }
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String sunemoji = new String(Character.toChars(0x1F31E));
        String moonemoji = new String(Character.toChars(0x1F31A));
        String[][] verticalRug = new String [11][11];
        for (int i = 0; i< verticalRug.length; i++){
            for (int j = 0; j< verticalRug[i].length; j++){
                if (j%2 == 0){
                    verticalRug[i][j] = sunemoji;
                } else {
                    verticalRug[i][j] = moonemoji;
                }
            }
        }
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

        return new String[][]; 
    }
}
