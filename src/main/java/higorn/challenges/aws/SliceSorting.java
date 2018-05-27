/*
 * File:   SliceSorting.java
 *
 * Created on 27/05/18, 12:10
 */
package higorn.challenges.aws;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author higor
 */
public class SliceSorting {
  public static int sort(int[] a) {
    return countSlices(Arrays.stream(a).boxed().collect(Collectors.toList()), 0);
  }

  private static int countSlices(List<Integer> list, int slices) {
    if (list.isEmpty()) {
      return slices;
    }
    return countSlices(list.subList(getMinIndex(list)+1, list.size()), slices + 1);
  }

  private static Integer getMinIndex(List<Integer> list) {
    return list.indexOf(list.stream().min(Integer::compareTo).get());
  }
}
