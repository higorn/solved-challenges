package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 23/05/18.
 */
public class SmallestPositiveIntegerTest {

    @Test
    public void testCase1() {
        int[] a = {1,3,6,4,1,2};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(5, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase2() {
        int[] a = {1,2,3};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(4, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase3() {
        int[] a = {-1,-3};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(1, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase4() {
        int[] a = {2};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(1, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase5() {
        int[] a = {0};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(1, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase6() {
        int[] a = {1};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(2, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase7() {
        int[] a = {3};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(1, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase8() {
        int[] a = {4, 5, 6, 2};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(1, smallestPositiveInteger.solution(a));
    }
    @Test
    public void testCase9() {
        int[] a = {-4, 4, 3, 2, 1, 5};
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        Assert.assertEquals(6, smallestPositiveInteger.solution(a));
    }
}
