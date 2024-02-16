public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        // TODO implement solid()
        String bowemoji = new String(Character. toChars (0x1F380));
        String [][] solidrug = new String [11][11];
        for (int i = 0; i < solidrug.length; i++){
            for (int j = 0; j < solidrug. length; j++){
                solidrug[i][j] = bowemoji;
            }
        }
        return solidrug;
    }

    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // TODO implement horizontal()
        String bowemoji = new String(Character.toChars(0x1F380));
        String diamondemoji = new String(Character.toChars(0x1F48E));
        String [][] horizontalRug = new String [11][11];
        for (int i = 0; i < horizontalRug.length; i++) {
            for (int j = 0; j < horizontalRug[i].length; j++){
                if (i%2 == 0){
                    horizontalRug[i][j] = bowemoji;
                } else{
                    horizontalRug [i][j] = diamondemoji;
                }
            }
        }
        return horizontalRug;
    }
    

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String bowemoji = new String(Character.toChars(0x1F380));
        String diamondemoji = new String(Character.toChars(0x1F48E));
        String[][] verticalRug = new String[11][11];
        for (int i = 0; i < verticalRug.length; i++) {
            for (int j = 0; j < verticalRug[i].length; j++){
                if (j%2 == 0){
                    verticalRug[i][j] = bowemoji;
                }else{
                    verticalRug[i][j] = diamondemoji;
                }
            }
        }
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // TODO implement diagonal()
        String bowemoji = new String(Character.toChars(0x1F380));
        String diamondemoji = new String(Character.toChars(0x1F48E));
        String[][] diagonalRug = new String[11][11];
        for (int i = 0; i < diagonalRug.length; i++) {
            for (int j = 0; j < diagonalRug[i].length; j++){
                if (j%2 == 0 ^ i%2 == 0){
                    diagonalRug[i][j] = bowemoji;
                } else {
                    diagonalRug[i][j] = diamondemoji;
                } 
            }
        } 
        return diagonalRug;  
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // TODO implement plaid()
        String bowemoji = new String(Character.toChars(0x1F380));
        String diamondemoji = new String(Character.toChars(0x1F48E));
        String[][] plaidRug = new String[11][11];
        for (int i = 0; i < plaidRug.length; i++){
            for ( int j = 0; j < plaidRug.length; j++){
                if (j%2 == 0 && i%2 == 0){
                    plaidRug[i][j] = bowemoji;
                } else {
                    plaidRug[i][j] = diamondemoji;
                }

            }
        }
        return plaidRug;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        return new String[0][0];
    }
}
