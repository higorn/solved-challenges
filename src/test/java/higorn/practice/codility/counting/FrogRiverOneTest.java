package higorn.practice.codility.counting;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {
    @Test
    public void case1() {
        int[] A = {1,3,1,4,2,3,5,4};
        Assert.assertEquals(6, FrogRiverOne.getEarliestJumpTime(5, A));
    }
    @Test
    public void case2() {
        int[] A = {1,3,1,4,2,3,5,4};
        Assert.assertEquals(4, FrogRiverOne.getEarliestJumpTime(4, A));
    }
    @Test
    public void case3() {
        int[] A = {3};
        Assert.assertEquals(-1, FrogRiverOne.getEarliestJumpTime(5, A));
    }
    @Test
    public void case4() {
        int[] A = {1,3,1,4,9,3,5,4};
        Assert.assertEquals(-1, FrogRiverOne.getEarliestJumpTime(4, A));
    }
    @Test
    public void case5() {
        int[] A = {1,3,1,4,5,3,5,4};
        Assert.assertEquals(-1, FrogRiverOne.getEarliestJumpTime(4, A));
    }
}
