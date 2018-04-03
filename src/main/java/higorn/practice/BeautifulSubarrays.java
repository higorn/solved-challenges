package higorn.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by higor on 03/04/18.
 */
public class BeautifulSubarrays {
    public static long beautifulSubarrays(int[] a, int m) {
        List<Integer> list = Arrays.stream(a).mapToObj(Integer::new).collect(Collectors.toList());
        if (list.stream().filter(e -> e%2 != 0).count() < m) {
            return 0;
        }

        Set<List<Integer>> set = new HashSet<>();
        set.add(list);
        getSubarrays(list.subList(1, list.size()), m, set, false);
        getSubarrays(list.subList(0, list.size()-1), m, set, true);

        return set.size();
    }

    private static void getSubarrays(List<Integer> list, int m, Set<List<Integer>> set, boolean backward) {
        if (list.isEmpty()) return;
        if (list.stream().filter(e -> e%2 != 0).count() >= m) {
            set.add(list);
        }
        if (backward) {
            getSubarrays(list.subList(0, list.size()-1), m, set, backward);
        } else {
            getSubarrays(list.subList(1, list.size()), m, set, backward);
        }
    }
}
