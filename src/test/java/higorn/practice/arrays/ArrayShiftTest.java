package higorn.practice.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 24/05/18.
 */
public class ArrayShiftTest {

    @Test
    public void case1() {
        int[] A = {3, 8, 9, 7, 6};
        int[] E = {9, 7, 6, 3, 8};

        Assert.assertArrayEquals(E, ArrayShift.shift(A, 3));
    }
    @Test
    public void case2() {
        int[] A = {};
        int[] E = {};

        Assert.assertArrayEquals(E, ArrayShift.shift(A, 3));
    }
}
