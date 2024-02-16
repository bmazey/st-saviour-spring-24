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
        String emoji1 = new String(Character.toChars(0x1F338));
        String emoji2 = new String(Character.toChars(0x1F339));

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

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String emoji3 = new String(Character.toChars(0x1F353));
        String emoji4 = new String(Character.toChars(0x1F361));

        // TODO implement vertical()
        String [][] vertical = new String [11][11];
        for ( int i = 0; i < vertical.length; i++) {
            for (int j = 0; j < vertical [i].length; j++) {
                if (j % 2 == 0) {
                    vertical [i][j] = emoji3;
                } else {
                    vertical [i][j] = emoji4;
                }
            }
        }
        return vertical;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        String emoji5 = new String(Character.toChars(0x1F337));
        String emoji6 = new String(Character.toChars(0x1F339));

        String [][] diagonal = new String [11][11];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal [i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) { 
                    diagonal [i][j] = emoji5;
                }
                if ( i % 2 == 1 && j % 2 == 1) {
                    diagonal [i][j] = emoji6;
                }
            }
        }
        return diagonal;
        
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        String emoji7 = new String(Character.toChars(0x1F353));
        String emoji8 = new String(Character.toChars(0x1F34A));
        
        String [][] plaid = new String [11][11];
        for ( int i = 0; i < plaid.length; i++) {
            for (int j = 0; j < plaid [i].length; j++) {
                if (j % 2 == 1 || i % 2 == 1) {
                    plaid[i][j] = emoji7;
                } else {
                    plaid[i][j] = emoji8;
                }
            } 
        }
        return plaid;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] argyleRug = new String[11][11];
        for (int i = 0; i < argyleRug.length; i++) {
            for (int j = 0; j < argyleRug[i].length; j++) {
                argyleRug[i][j] = tigeremoji;
                if ( i == j) {
                    argyleRug[i][j] = dolphinemoji;
                }
                if (i + j == 10) {
                    argyleRug [i][j] = tigeremoji;
                }
            }
        }
        for (int i = 0; i < argyleRug.length/2 + 1; i++){
            argyleRug[i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[i][argyleRug.length / 2 - i] = dolphinemoji;

            argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[argyleRug.length -1 - i][argyleRug.length / 2 - 1] = dolphinemoji;
        }
        return argyleRug;
    }
        
}
