import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.json.JSONObject;

public class Topics {
    public static void main(String[] args) {

        // Create a regular expression.
        // Pattern pattern = Pattern.compile("abc.");

        // Check to see if given text is matched by the regex pattern.
        // System.out.println(pattern.matcher("abcd").matches());

        // Maps in Java.
        Map<String, String> ID = new HashMap<>();

        ID.put("Name", "Jane Doe");
        ID.put("City", "Chicago");
        ID.put("Age", "22");

        System.out.println(ID.get("Name"));

        // No duplicates alllowed!

        // Meet my friend JSON (JavaScript Object Notation).
        JSONObject ID2 = new JSONObject(
            "{\"name\":\"john doe\",\"city\":\"chicago\",\"age\":\"22\"}"
        );

        System.out.println(ID2.get("name"));
    }
}
