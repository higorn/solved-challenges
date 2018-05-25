package higorn.practice.arrays;

import java.util.*;

public class OddOcurrencesInArray {
    public static int getOddOccurrency(int[] A) {
        Map<Integer, Integer> map = new HashMap<>(A.length);
        for (int n : A) {
            int count = Optional.ofNullable(map.get(n)).orElse(0) + 1;
            map.put(n, count);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) {
                return e.getKey();
            }
        }
        return 0;
        // This is almost 100ms slower
/*        return map.entrySet().stream()
                .filter(e -> e.getValue() % 2 == 1)
                .map(e -> e.getKey())
                .reduce(0, (n1, n2) -> n2.intValue());*/
    }
}
