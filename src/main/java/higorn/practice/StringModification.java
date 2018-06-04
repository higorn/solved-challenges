/*
 * File:   StringModification.java
 *
 * Created on 26/05/18, 13:22
 */
package higorn.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author higor
 */
public class StringModification {
  public static int modify(String str, int k) {
    List<String> groups = getGroups(str, k);
    if (groups.isEmpty()) {
      return k;
    }
    return groups.stream()
        .filter(g -> g.length() > k)
        .map(g -> g.length())
        .reduce((g1, g2) -> (g1 - k) + (g2 % k == 0 ? 1 : g2 - k))
        .orElse(k - groups.stream()
          .map(g -> g.length())
          .max(Integer::compareTo)
          .get());
  }

  private static List<String> getGroups(String str, int k) {
    Pattern pattern = Pattern.compile("([M]+)");
    Matcher matcher = pattern.matcher(str);
    List<String> list = new ArrayList<>();
    while (matcher.find()) {
      String group = matcher.group(1);
      list.add(group);
    }
    return list;
  }
}
