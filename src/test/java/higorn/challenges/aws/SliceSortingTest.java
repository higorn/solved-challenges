/*
 * File:   SliceSortingTest.java
 *
 * Created on 27/05/18, 12:08
 */
package higorn.challenges.aws;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author higor
 */
public class SliceSortingTest {
  @Test
  public void case1() {
    int[] A = {2,4,1,6,5,9,7};
    Assert.assertEquals(3, SliceSorting.sort(A));
  }
  @Test
  public void case2() {
    int[] A = {4,3,2,6,1};
    Assert.assertEquals(1, SliceSorting.sort(A));
  }
  @Test
  public void case3() {
    int[] A = {2,1,6,4,3,7};
    Assert.assertEquals(3, SliceSorting.sort(A));
  }
  @Test
  public void case4() {
    int[] A = {2};
    Assert.assertEquals(1, SliceSorting.sort(A));
  }
  @Test
  public void case5() {
    int[] A = {1,2,6,4,3,7};
    Assert.assertEquals(3, SliceSorting.sort(A));
  }
}
