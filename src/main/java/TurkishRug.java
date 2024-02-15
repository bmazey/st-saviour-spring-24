public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        String emoji = new String(Character.toChars(0x2665));
        String [][] solid = new String[11][11];
        for (int i = 0; i < solid.length; i++){
            for (int j = 0; j < solid.length; j++){
                solid[i][j] = emoji;
            }
        }
        return solid; 
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String club = new String(Character.toChars(0x2663));
        String spade = new String (Character.toChars(0x2660));
        String [][] horizontal = new String [11][11];
        for (int i = 0; i < horizontal.length; i++){
            for (int j = 0; j < horizontal.length; j++){
                if (i % 2== 0){
                    horizontal[i][j] = club;
                } else{
                    horizontal [i][j] = spade;
                }
            }
        }
        return horizontal;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String [][] vertical = new String [11][11];
        String club = new String (Character.toChars(0x2663));
        String spade = new String (Character.toChars(0x2660));
        for (int i = 0; i < vertical.length; i++){
            for (int j = 0; j < vertical.length; j++){
                if (j % 2 ==0){
                    vertical[i][j] = club;
                }else{
                    vertical[i][j] = spade;
                }
            }
        }
        return vertical;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // TODO implement diagonal()
        String [][] diagonal = new String [11][11];
        String sun = new String (Character.toChars(0x1F31E));
        String moon = new String (Character.toChars(0x1F31D));
        for (int i = 0; i < diagonal.length; i ++){
            for (int j = 0; j < diagonal.length; j++){
                diagonal[i][j] = sun;
                if (i % 2 == 0 && j % 2 == 0){ // work on this 
                    diagonal[i][j] = moon; 
                }
                if (i % 2 != 0 && j % 2 != 0){
                    diagonal[i][j] = moon;
                }
            }
        }
        return diagonal; 
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        String [][] plaid = new String [11][11];
        String dragon = new String (Character.toChars(0x1F432));
        String rabbit = new String (Character.toChars(0x1F430));
        for (int i = 0; i < plaid.length; i ++){
            for (int j = 0; j < plaid.length; j++){
                if (i % 2 == 0 && j % 2 == 0){ 
                    plaid[i][j] = dragon; 
                }else{
                    plaid[i][j] = rabbit;
                }
            }
        }
        return plaid; 
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        String [][] argyle = new String[11][11];
        String balloon = new String (Character.toChars (0x1F388));
        String hand = new String (Character.toChars(0x270B));
        for (int i = 0; i < argyle.length; i ++){
            for (int j = 0; j < argyle.length; j ++){
                argyle [i][j] = hand;
                // if (i % 5 == 0 && j % 5 == 0){
                //     argyle [i][j] = balloon;
                // }
                if (i == j){
                    argyle[i][j] = balloon;
                }
                if (j == 11 - 1 - i){
                    argyle [i][j] = balloon;
                }
                if (j == 11/2 + i){
                    argyle[i][j] = balloon;
                }
                if (j == 11/2 - i){
                    argyle[i][j] = balloon;
                }
                if (i == 11/2 + j){
                    argyle [i][j] = balloon;
                }
                if (i == 11/2 - i){
                    argyle [i][j] = balloon;
                }
            }
        }
        return argyle;
    }
}
