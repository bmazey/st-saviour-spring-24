public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        String whiteFlowerEmoji = new String(Character.toChars(0x1F4AE));
        String[][] solidRug = new String[11][11];
        for (int i = 0; i < solidRug.length; i++){
            for (int j = 0; j < solidRug[i].length; j++){
                solidRug[i][j] = whiteFlowerEmoji;
            }
        }
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // TODO implement horizontal()
        String whiteFlowerEmoji = new String(Character.toChars(0x1F4AE));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] horizontalRug = new String[11][11];
        for (int i = 0; i < horizontalRug.length; i++){
            for (int j = 0; j < horizontalRug[i].length; j++){
                horizontalRug[i][j] = whiteFlowerEmoji;
                if (i % 2 == 0); 
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
