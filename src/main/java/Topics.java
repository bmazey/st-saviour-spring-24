import java.util.regex.Pattern;

public class Topics {
    public static void main(String[] args) {

        // Create a regular expression.
        Pattern pattern = Pattern.compile("abc.");

        // Check to see if given text is matched by the regex pattern.
        System.out.println(pattern.matcher("abcd").matches());
    }
}
