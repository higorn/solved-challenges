/*
 * File:   Aws1Test.java
 *
 * Created on 26/05/18, 19:36
 */
package higorn.practice.aws;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author higor
 */
public class ArraySegmentsCollectorTest {
  @Test
  public void case1() {
    int[] A = {10, 19, 15};
    Assert.assertEquals(-1, ArraySegmentsCollector.collect(A, 2, 2));
  }
  @Test
  public void case2() {
    int[] A = {6,1,4,6,3,2,7,4};
    Assert.assertEquals(24, ArraySegmentsCollector.collect(A, 3, 2));
  }
  @Test
  public void case3() {
    int[] A = {10,19,15,12};
    Assert.assertEquals(-1, ArraySegmentsCollector.collect(A, 2, 2));
  }
}
