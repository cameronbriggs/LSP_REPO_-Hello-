package org.howard.edu.lsp.midterm.question4
  
import java.util.HashMap;

public class MapUtilitiesDriver {

    public static void main(String[] args) {
        // Create map1 and add key-value pairs to it
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Felix", "Fine");

        // Create map2 and add key-value pairs to it
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Bob", "Happy");
        map2.put("Felix", "Sad");

        // Output the number of common key/value pairs
        System.out.println("Number of common key/value pairs is: " +
                MapUtilities.commonKeyValuePairs(map1, map2));
    }
}
