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
        // TODO implement vertical()
        return new String[0][0];
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // TODO implement diagonal()
        return new String[0][0];
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // TODO implement plaid()
        return new String[0][0];
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        return new String[0][0];
    }
}
