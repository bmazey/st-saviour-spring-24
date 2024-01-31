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
        Map<String, String> Treasure = new HashMap<>();

        Treasure.put("Hidden", "Lagoon");
        Treasure.put("Jolly", "Rodger");
        Treasure.put("X", "Marks the spot.");

        System.out.println(Treasure.get("X"));

        // Meet my friend JSON (JavaScript Object Notation).
        JSONObject ID = new JSONObject(
            "{\"city\":\"chicago\",\"name\":\"jane doe\",\"age\":\"22\"}"
        );

        System.out.println(ID.get("name"));
    }
}
