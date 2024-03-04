import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Topics {
    public static void main(String[] args) {
        // a space for AP practice problems
        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(3);
        numList.add(2);
        numList.add(1);
        numList.add(1, 0);
        numList.set(0, 2);
        // System.out.print(numList);

        String apple = "apple";
        String pear = apple.substring(0, 2);
        System.out.println(pear);
    }







    // Recursive fibonacci.
    // Return the Nth number of the sequence.
    public static int fibonacci(int n) {
        // Establish a base case.
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
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
            dynamic[i] = dynamic[i - 1] + dynamic[i - 2];
        }

        return dynamic[n - 1];
    }
}
