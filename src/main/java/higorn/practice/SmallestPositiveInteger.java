package higorn.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by higor on 23/05/18.
 */
public class SmallestPositiveInteger {
    public int solutionV1(int[] A) {
        Set<Integer> set1 = Arrays.stream(A).boxed().collect(Collectors.toSet());
        if (set1.size() == 1) {
            return getMin(set1.iterator().next());
        }
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        Set<Integer> set2 = IntStream.rangeClosed(min > 1 ? 1 : min, max).boxed().collect(Collectors.toSet());
        set2.removeAll(set1);
        return set2.stream().min(Integer::compareTo).map(n -> n <= 0 ? 1 : n).orElse(max <= 0 ? 1 : max + 1);
    }

    public int solution(int[] A) {
        if (A.length == 1) {
            return getMin(A[0]);
        }
        return getMin(arrayToMap(A));
    }

    private int getMin(int n) {
        return n < 1 || n > 1 ? 1 : n + 1;
    }

    private int getMin(Map<Integer, Integer> mapA) {
        if (mapA.isEmpty()) {
            return 1;
        }
        int min = 0;
        Integer i;
        for (i = 1; i <= mapA.size(); i++) {
            if (mapA.get(i) == null && (min == 0 || i < min)) {
                min = i;
            }
        }

        return min == 0 ? i : min;
    }

    private Map<Integer, Integer> arrayToMap(int[] A) {
        Map<Integer, Integer> map = new HashMap<>(A.length);
        for (int n : A) {
            if (n > 0) {
                map.put(n, n);
            }
        }
        return map;
        // This is slower than the above solution
//        return Arrays.stream(A)
//                    .boxed()
//                    .filter(n -> n > 0)
//                    .distinct()
//                    .collect(Collectors.toMap(k -> k, v -> v));
    }
}
