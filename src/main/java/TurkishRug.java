public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        // TODO implement solid()
        String emoji = new String(Character.toChars(0x1F349));

        String[][] solid = new String[11][11];
        for ( int i = 0; i < solid.length; i++) {
            for (int j = 0; j < solid [i].length; j++) {
                solid [i][j] = emoji;
            }
        }

        return solid;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String emoji1 = new String(Character.toChars(0x2665));
        String emoji2 = new String(Character.toChars(0x2663));

        // TODO implement horizontal()
        String[][] horizontal = new String [11][11];
        for ( int i = 0; i < horizontal.length; i++) {
            for (int j = 0; j < horizontal[i].length; j++) {
                if (i % 2 == 0) {
                     horizontal[i][j] = emoji1;
                } else {
                    horizontal[i][j] = emoji2;
                }
            }
        }
        return horizontal;
    }

        String [][] vertical = new String [11][11];
            for ( int i = 0; i < vertical.length; i++) {
                for (int j = 0; j < vertical [i].length; j++) {
                    if (j % 2 == 0) {
                        vertical [i][j] = emoji1;
               }    else {
                        vertical [i][j] = emoji2;
       }
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
