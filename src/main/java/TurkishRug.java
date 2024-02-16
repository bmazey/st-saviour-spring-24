public class TurkishRug {

    public static String[][] solid() {
        // establish solid as a string array
        String emoji = new String(Character.toChars(0x1F349));
        String[][] solid = new String[11][11];
        for ( int i = 0; i < solid.length; i++) {
            for (int j = 0; j < solid [i].length; j++) {
        // established the parameters for i and j increasing
                solid [i][j] = emoji;
            }
    }

        return solid;
}
    

    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String emoji1 = new String(Character.toChars(0x1F338));
        String emoji2 = new String(Character.toChars(0x1F339));

         // establish horizontal as a string array with the parameters 11x11
        String[][] horizontal = new String [11][11];
        for ( int i = 0; i < horizontal.length; i++) {
            for (int j = 0; j < horizontal[i].length; j++) {
                if (i % 2 == 0) {
                     horizontal[i][j] = emoji1;
                //setting up the condition when i is even emoji1 will printed
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

        // established vertical as a string array 
        String [][] vertical = new String [11][11];
        for ( int i = 0; i < vertical.length; i++) {
            for (int j = 0; j < vertical [i].length; j++) {
                vertical [i][j] = emoji3;
                //creating a solid rug of one emoji then specifying when j is even, another emoji should be implemented 
                if (j % 2 == 0) {
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
                diagonal [i][j] = emoji5;
                if (i % 2 == 0 && j % 2 == 0) { 
                    diagonal [i][j] = emoji6;
                }
                // using an and conditon to specify that even values of i and j are emoji6
                if ( i % 2 == 1 && j % 2 == 1) {
                  diagonal [i][j] = emoji6;
                // using an and conditon to specify that odd values of i and j are emoji6
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
                plaid[i][j] = emoji7;
                if (j % 2 == 1) {
                    plaid[i][j] = emoji8;
                }
                //using moduluo to say that when j is odd emoji8 is printed 
                if (i % 2 == 1) {
                    plaid[i][j] = emoji8;
                }
                //using moduluo to say that when i is odd emoji8 is printed 
            } 
        }
         return plaid;
    }



    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        // Create a String array with dimensions 11x11
        String[][] argyleRug = new String[11][11];
        for (int i = 0; i < argyleRug.length; i++) {
            for (int j = 0; j < argyleRug[i].length; j++) {
                argyleRug[i][j] = tigeremoji;
                if ( i == j) {
                    argyleRug[i][j] = dolphinemoji;
                //when i and j are equal, it produces the first diagonal line 
                }
                if (i + j == 10) {
                    argyleRug[i][j] = dolphinemoji;
                // creates the other crossing diagonals 
                }
            }
        }
        //forming the bottom half of the argyle using + and - i to shift from left to right 
        for (int i = 0; i < argyleRug.length/2 + 1; i++){
            argyleRug[i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[i][argyleRug.length / 2 - i] = dolphinemoji;

            argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 - i] = dolphinemoji;
        }
        return argyleRug;
    }
        
}
