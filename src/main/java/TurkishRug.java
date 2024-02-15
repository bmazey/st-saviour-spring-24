public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        //creates a variable that stores the sun emoji
        String sunemoji = new String(Character.toChars(0x1F506));
        //creates a multidimensional array called rug that is 11x11
        String[][] rug = new String[11][11];
        //iterates through the i values, which are down
        for (int i = 0; i < rug.length; i++){
            //iterates through the j values, which are to the right
            for (int j = 0; j < rug[i].length; j++){
                //puts a sun emoji for each item in the rug
                rug[i][j] = sunemoji;
            }
        }
        //returns the rug
        return rug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        //creates a variable that stores the sun emoji
        String sunemoji = new String(Character.toChars(0x1F506));
        //creates a variable that stores the moon emoji
        String moonemoji = new String(Character.toChars(0x1F31C));
        //creates a multidimensional array called horizontalRug that is 11x11
        String[][] horizontalRug = new String[11][11];
        //iterates through the i values, which are down
        for (int i = 0; i < horizontalRug.length; i++){
            //iterates through the j values, which are to the right
            for (int j = 0; j < horizontalRug[i].length; j++){
                //places a sun emoji if the i value is even otherwise puts a moon
                if (i%2 == 0){
                    horizontalRug[i][j] = sunemoji;
                } else {
                    horizontalRug[i][j] = moonemoji;
                }
            }
        }
        //returns the completed rug
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        //creates a variable that stores the sun emoji
        String sunemoji = new String(Character.toChars(0x1F506));
        //creates a variable that stores the moon emoji
        String moonemoji = new String(Character.toChars(0x1F31C));
        //creates a multidimensional array called verticalRugthat is 11x11
        String[][] verticalRug = new String[11][11];
        //iterates through the i values, which are down
        for (int i = 0; i < verticalRug.length; i++){
            //iterates through the j values, which are to the right
            for (int j = 0; j < verticalRug[i].length; j++){
                //places a sun emoji if the j value is even, otherwise places a moon emoji
                if (j%2 == 0){
                    verticalRug[i][j] = sunemoji;
                } else {
                    verticalRug[i][j] = moonemoji;
                }
            }
        }
        //returns the completed rug
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        //creates a variable that stores the sun emoji
        String sunemoji = new String(Character.toChars(0x1F506));
        //creates a variable that stores the moon emoji
        String moonemoji = new String(Character.toChars(0x1F31C));
        //creates a multidimensional array called diagonalRug that is 11x11
        String[][] diagonalRug = new String[11][11];
        //iterates through the i values, which are down
        for (int i = 0; i < diagonalRug.length; i++){
            //iterates through the j values, which are to the right
            for (int j = 0; j < diagonalRug[i].length; j++){
                //places a sun emoji if only j or only i is even otherwise places a moon emoji
                if (j%2 == 0 ^ i%2 == 0){
                    diagonalRug[i][j] = sunemoji;
                } else {
                    diagonalRug[i][j] = moonemoji;
                }
            }
        }
        //returns the completed rug
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        //creates a variable that stores the sun emoji
        String sunemoji = new String(Character.toChars(0x1F506));
        //creates a variable that stores the moon emoji
        String moonemoji = new String(Character.toChars(0x1F31C));
        //creates a multidimensional array called plaidRug that is 11x11
        String[][] plaidRug = new String[11][11];
        //iterates through the i values, which are down
        for (int i = 0; i < plaidRug.length; i++){
            //iterates through the j values, which are to the right
            for (int j = 0; j < plaidRug[i].length; j++){
                //places a sun emoji if both i and j values are even, otherwise place a moon emoji
                if (j%2 == 0 && i%2 == 0){
                    plaidRug[i][j] = sunemoji;
                } else {
                    plaidRug[i][j] = moonemoji;
                }
            }
        }
        //returns the completed rug
        return plaidRug;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        return new String[0][0];
    }
}
