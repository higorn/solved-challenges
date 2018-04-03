package higorn.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by higor on 03/04/18.
 */
public class RansonNote {
    public static boolean canCreate(String[] magazine, String[] ransom) {
        Map<String, Integer> magazineMap = new HashMap<>();
        for (String key : magazine) {
            Integer n = magazineMap.get(key);
            if (n == null) {
                n = 1;
            } else {
                n = n + 1;
            }
            magazineMap.put(key, n);
        }
        for (String str: ransom) {
            Integer n = magazineMap.get(str);
            if (n == null || n == 0) {
                return false;
            }
            magazineMap.put(str, n - 1);
        }
        return true;
    }
}
