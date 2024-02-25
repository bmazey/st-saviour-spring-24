public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
    // Define the emoji character for the solid pattern
        String emoji = new String(Character.toChars(0x1F365));
        String[][] solid = new String[11][11];
     // Iterate through each row in the 2D array
        for (int i = 0; i < solid.length; i++) {
    // Iterate through each column in the current row        
            for (int j = 0; j < solid[i].length; j++) {
                solid[i][j] = emoji;
            }
        }
             
        return solid;
    }
    
    // Creates a horizontal striped 2D String array.
    // Very similar steps to solid  
    public static String[][] horizontal() {
        String emoji1 = new String(Character.toChars(0x2665));
        String emoji2 = new String(Character.toChars(0x2663));
        
        String[][] horizontal = new String[11][11];
        for (int i = 0; i < horizontal.length; i++) {
            for (int j = 0; j < horizontal[i].length; j++) {
            if ( i % 2 == 0) {
                horizontal[i][j] = emoji1;
            }   else {
                horizontal[i][j] = emoji2;
            }
        }
     }    

        return horizontal;
    }

    // Creates a vertical striped 2D String array.
    // very similar to horizontal but iteration focus on j variable
    public static String[][] vertical() {
        String emoji3 = new String(Character.toChars(0x1F353));
        String emoji4 = new String(Character.toChars(0x1F361));
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
                diagonal[i][j] = emoji5;
     // Check if both row and column indices are even or both are odd
    // Assign the alternate emoji to create a diagonally striped pattern
                if (i % 2 == 0 && j % 2 == 0) { 
                    diagonal [i][j] = emoji6;
            } 
                if (i % 2 == 1 && j % 2 == 1) { 
                diagonal [i][j] = emoji6;
                }
            }
        }
        return diagonal;
        
    }

   // Creates a plaid 2D String array.
    public static String[][] plaid() {
    String emoji7 = new String(Character.toChars(0x1F361));
    String emoji8 = new String(Character.toChars(0x1F34A));

    String[][] plaid = new String[11][11];
    for (int i = 0; i < plaid.length; i++) {
        for (int j = 0; j < plaid[i].length; j++) {
     // Alternate between emoji7 and emoji8 based on both row and column indices
            plaid[i][j] = emoji8;
            if (i % 2 == 0 && j % 2 == 0) {
                plaid[i][j] = emoji7;
                }
            } 
        }
        return plaid;
    }
    


    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        String emoji9 = new String(Character.toChars(0x1F353));
        String emoji10 = new String(Character.toChars(0x1F361));
        String [][] argyleRug = new String [11][11];
    // Fill the array with the default emoji10  
        for(int i = 0; i < argyleRug.length; i++) {
            for(int j = 0; j < argyleRug[i].length; j++){
                argyleRug[i][j] = emoji10;
    // Check for the positions where emoji 9 should be placed
                if(i == j){
                    argyleRug[i][j] = emoji9;
                }
                if(i + j == 10){
                    argyleRug[i][j] = emoji9;
                }    
            }
        }
    
    // Fill the diagonal and anti-diagonal lines with argyle emoji
        for(int i =0; i < argyleRug.length / 2 + 1; i++){
                argyleRug[i][argyleRug.length / 2 + i] = emoji9;
                argyleRug[i][argyleRug.length / 2 - i] = emoji9;

                argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 + i] = emoji9;
                argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 - i] = emoji9;
            }

        return argyleRug;
    }
}
