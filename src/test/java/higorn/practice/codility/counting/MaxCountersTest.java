package higorn.practice.codility.counting;

import org.junit.Assert;
import org.junit.Test;

public class MaxCountersTest {
  @Test
  public void case1() {
    int[] A = {3,4,4,6,1,4,4};
    int[] expected = {3,2,2,4,2};
    Assert.assertArrayEquals(expected, MaxCounters.count(5, A));
  }
  @Test
  public void case2() {
    int[] A = {3,4,4,6,1,4,4};
    int[] expected = {1};
    Assert.assertArrayEquals(expected, MaxCounters.count(1, A));
  }
  @Test
  public void case3() {
    int[] A = {3,4,4,6,1,4,4};
    int[] expected = {1,1};
    Assert.assertArrayEquals(expected, MaxCounters.count(2, A));
  }
  @Test
  public void case4() {
    int[] A = {1,2,3,6,4,5,5};
    int[] expected = {1,1,1,2,3};
    Assert.assertArrayEquals(expected, MaxCounters.count(5, A));
  }
  @Test
  public void case5() {
    int[] A = {2,8,2,8,2,8,2,2,8,2,2,8,2,8};
    int[] expected = {8,8,8,8,8,8,8};
    Assert.assertArrayEquals(expected, MaxCounters.count(7, A));
  }
  @Test
  public void case6() {
    int[] A = {3,4,4,6,1,4,6,4,2};
    int[] expected = {3,4,3,4,3};
    Assert.assertArrayEquals(expected, MaxCounters.count(5, A));
  }
}
