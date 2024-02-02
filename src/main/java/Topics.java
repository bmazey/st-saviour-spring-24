import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

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

        // System.out.println(ID.get("Name"));

        ID.put("Phone", "718-860-2842");
        // System.out.println(ID.get("Phone"));
        ID.put("City", "Detroit");
        // System.out.println(ID.get("City"));

        // No duplicates allowed!

        // Meet my friend JSON (JavaScript Object Notation).
        JSONObject ID2 = new JSONObject(
            "{\"name\":\"john doe\",\"city\":\"chicago\",\"age\":\"22\"}"
        );

        // System.out.println(ID2.get("name"));

        // Fibonacci examples.
        // System.out.println(fibonacci(48));
        // System.out.println(dynamicFibonacci(48));
    }

    // Recursive fibonacci.
    public static int fibonacci(int n) {
        // Establish a base case.
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n -2);
    }

    // Dynamic fibonacci.
    public static int dynamicFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        // Create a new array to store calculations.
        int[] dynamic = new int[n];
        dynamic[0] = 1;
        dynamic[1] = 1;

        for(int i = 2; i < dynamic.length; i++) {
            dynamic[i] = dynamic[i - 1] + dynamic[i -2];
        }

        return dynamic[n - 1];
    }
}
