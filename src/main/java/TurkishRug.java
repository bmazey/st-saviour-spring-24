public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        // TODO implement solid()
        //Pick a color for your rug and set the dimensions for your rug
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String[][] solidRug = new String [11][11];
        //Weaving the rows and columns of your rug
            for(int i = 0; i < solidRug.length; i++){
                for(int j = 0; j < solidRug[i].length; j++){
                    solidRug[i][j] = dolphinemoji;
                }
            }
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // TODO implement horizontal()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] horizontalRug = new String [11][11];
        for(int i = 0; i < horizontalRug.length; i++){
            for(int j = 0; j < horizontalRug[i].length; j++) {
                // The pattern for this rug is different so create a method that will make 6 rows 1 color and the other 5 rows the second color
                if(i % 2 == 0) {
                    horizontalRug[i][j] = dolphinemoji;
                }
                else {
                    horizontalRug[i][j] = tigeremoji;
                }
            }
        }
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        // TODO implement vertical()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] verticalRug = new String [11][11];
        for(int i = 0; i < verticalRug.length; i++){
            for(int j = 0; j < verticalRug[i].length; j++) {
                // The method is just as before but the only thing changing is the columns instead of rows
                if(j % 2 == 0) {
                    verticalRug[i][j] = dolphinemoji;
                }
                else {
                    verticalRug[i][j] = tigeremoji;
                }
            }
        }
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // TODO implement diagonal()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] diagonalRug = new String [11][11];
        for(int i = 0; i < diagonalRug.length; i++) {
            for(int j = 0; j < diagonalRug.length; j++) {
                diagonalRug[i][j] = tigeremoji;
                //Create a method that solves 2 problems at once to get the desired pattern
                if(i % 2 == 0 && j % 2 == 0){
                    diagonalRug[i][j] = dolphinemoji;
                }
                if(i % 2 != 0 && j % 2 != 0){
                    diagonalRug[i][j] = dolphinemoji;
                }
            }
        }
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // TODO implement plaid()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] plaidRug = new String [11][11];
        for(int i = 0; i < plaidRug.length; i++){
            //For plaid set a method that gives your rug a default color
            for(int j = 0; j < plaidRug[i].length; j++){
                plaidRug[i][j] = tigeremoji;
                //Create a method that solves mod to create the "plaid" in your rug
                if(i % 2 == 0 && j % 2 == 0){
                    plaidRug[i][j] = dolphinemoji;
                }
            }
        }
        return plaidRug;
    }
      
    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        String dolphinemoji = new String(Character.toChars(0x1F42C));
        String tigeremoji = new String(Character.toChars(0x1F42F));
        String[][] argyleRug = new String [11][11];
        for(int i = 0; i < argyleRug.length; i++){
            for(int j = 0; j < argyleRug[i].length; j++){
                argyleRug[i][j] = tigeremoji;
                if(i == j){
                    argyleRug[i][j] = dolphinemoji;
                }
                if(i + j == 10) {
                    argyleRug[i][j] = dolphinemoji;
                }
          
            }      
        }
          // at this point the cross is drawn
        for(int i = 0; i < argyleRug.length/2 + 1; i++){
            // top half
            argyleRug[i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[i][argyleRug.length / 2 - i] = dolphinemoji;

            // bottom half
            argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 + i] = dolphinemoji;
            argyleRug[argyleRug.length - 1 - i][argyleRug.length / 2 - i] = dolphinemoji;
          }
        return argyleRug;
    }
}
 //Alternative pattern to create the diamond needed for argyle
 //     if(i + j == 5){
            //         argyleRug[i][j] = dolphinemoji;
            //     }
            //     if(j-i == 5){
            //         argyleRug[i][j] = dolphinemoji;
            //     }
            //     if(i-j == 5){
            //         argyleRug[i][j] = dolphinemoji;
            // }  
            // if(i + j == 15){
                // arguleRug[i][j] = dolphin emoji
             // }
        
            //