/*
 * File:   FibonacciTest.java
 *
 * Created on 24/05/18, 21:51
 */
package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author higor
 */
public class FibonacciTest {

  @Test
  public void case1() {
    Assert.assertEquals(5, fibonacci(5));
    Assert.assertEquals(8, fibonacci(6));
    Assert.assertEquals(13, fibonacci(7));
  }

  private int fibonacci(int n) {
    if (n == 1) {
      return 1;
    }
    int a = 0;
    int b = 1;
    int c = 0;
    for (int i = 1; i < n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return c;
  }

  private int fibonacciRecur(int n) {
     return fibonacciHelper(0, 1, n);
  }

  private int fibonacciHelper(int a, int b, int n) {
    return n == 1 ? b : fibonacciHelper(b, a + b, n - 1);
  }
}
