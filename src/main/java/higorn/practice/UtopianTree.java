package higorn.practice;

import java.util.stream.IntStream;

/**
 * Created by higor on 03/04/18.
 */
public class UtopianTree {
    public static int getGrowth(int cycles) {
        int growth = 1;
        for (int i = 1; i <= cycles; i++) {
            growth = i%2 == 0 ? growth + 1 : growth * 2;
        }
        return growth;
//        return IntStream.rangeClosed(1, cycles).reduce(growth, n -> n%2 == 0 ? n++ : n*2).
    }
}
