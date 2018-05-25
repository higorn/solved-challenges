package higorn.practice.arrays;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {
    @Test
    public void case1() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Assert.assertEquals(7, OddOcurrencesInArray.getOddOccurrency(A));
    }
    @Test
    public void case2() {
        int[] A = {9, 3, 9, 3, 9, 7, 9, 8, 3, 8, 3};
        Assert.assertEquals(7, OddOcurrencesInArray.getOddOccurrency(A));
    }
}
