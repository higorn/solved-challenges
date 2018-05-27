/*
 * File:   Aws1.java
 *
 * Created on 26/05/18, 19:37
 */
package higorn.practice.aws;

/**
 * @author higor
 */
public class ArraySegmentsCollector {
  public static int collect(int[] A, int K, int L) {
    if (K + L > A.length) {
      return -1;
    }

    try {
      return collect(A, K) + collect(A, L);
    } catch (Exception e) {
      return -1;
    }
  }

  /*
   * In the previous solution I've tried to use a HashMap where the keys
   * were the segments sum and values the start and end's segments positions.
   * But a realized it could be simpler like this final solution below.
   */
  private static int collect(int[] a, int k) throws Exception {
    int startSegment = 0;
    int endSegment = k;
    int maxStart = 0;
    int maxEnd = 0;
    int max = 0;
    while (endSegment <= a.length) {        // segment loop
      int sum = 0;
      for (int i = startSegment; i < endSegment; i++) {     // segment iteration
        int val = a[i];
        if (val == 0) {
          sum = 0;
          break;
        }
        sum += val;
      }
      if (sum > max) {
        max = sum;
        maxStart = startSegment;
        maxEnd = endSegment;
      }
      startSegment++;
      endSegment++;
    }
    if (max == 0) {
      throw new Exception("not sush intervals");
    }
    for (int i = maxStart; i < maxEnd; i++) {  // set collecteds to 0
      a[i] = 0;
    }
    return max;
  }
}
