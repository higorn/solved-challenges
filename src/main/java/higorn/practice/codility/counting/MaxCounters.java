package higorn.practice.codility.counting;

import java.util.Arrays;

public class MaxCounters {
  public static int[] count(int N, int[] A) {
    int maxCur = 0;
    int max = 0;
    int[] counters = new int[N];
    for (int i = 0; i < A.length; i++) {
      int op = A[i];
      if (op > N) {
        max = maxCur;
      } else {
        int cur = counters[A[i]-1];
        if (cur < max) {
          counters[A[i]-1] = max + 1;
        } else {
          counters[A[i]-1] = ++cur;
        }
        if (cur > maxCur) {
          maxCur = cur;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      if (counters[i] < max) {
        counters[i] = max;
      }
    }
    return counters;
  }

  private static void maxCounter(int[] counters) {
    int max = 0;
    for (int c : counters) {
      if (c > max) {
        max = c;
      }
    }
    Arrays.fill(counters, max);
  }

  private static int increase(int counter) {
    return ++counter;
  }
}
