package higorn.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by higor on 24/05/18.
 */
public class ArrayShift {
    public static int[] shift(int[] A, int K) {
        if (A.length < 2) {
            return A;
        }
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

        return shift(list, K);
    }

    public static int[] shift(final List<Integer> l, int k) {
        if (k == 0) {
            return listToArray(l);
        }
        Integer last = l.get(l.size()-1);
        List<Integer> subList = l.subList(0, l.size() - 1);
        subList.add(0, last);
        return shift(subList, k - 1);
    }

    private static int[] listToArray(final List<Integer> l) {
        int[] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }
}
