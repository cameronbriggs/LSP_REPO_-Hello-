package org.howard.edu.lsp.midterm.question4
  
import java.util.HashMap;

public class MapUtilities {

    /**
     * This method counts how many key/value pairs two HashMaps have in common.
     * A key/value pair is considered common if both the key and the associated value
     * are the same in both maps.
     *
     * @param map1 the first HashMap (String to String)
     * @param map2 the second HashMap (String to String)
     * @return the number of common key/value pairs, or 0 if either or both maps are empty
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through each key in map1
        for (String key : map1.keySet()) {
            // Check if map2 contains the same key and if the values are the same
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
