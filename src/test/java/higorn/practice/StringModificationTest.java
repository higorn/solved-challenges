/*
 * File:   StringModificationTest.java
 *
 * Created on 26/05/18, 13:19
 */
package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author higor
 * Given a string of letters 'M' and 'L', compute the minimum number of changes
 * needed to obtain a string such that the length of its longest interval
 * of letters 'M' is equal to K
 */
public class StringModificationTest {

  @Test
  public void case1() {
    String str = "MLMMLLM";
    Assert.assertEquals(1, StringModification.modify(str, 3));
  }
  @Test
  public void case2() {
    String str = "MLMMMLMMMM";
    Assert.assertEquals(2, StringModification.modify(str, 2));
  }
  @Test
  public void case3() {
    String str = "MLMMLLM";
    Assert.assertEquals(0, StringModification.modify(str, 2));
  }
  @Test
  public void case4() {
    String str = "M";
    Assert.assertEquals(1, StringModification.modify(str, 0));
  }
  @Test
  public void case5() {
    String str = "L";
    Assert.assertEquals(1, StringModification.modify(str, 1));
  }
  @Test
  public void case6() {
    String str = "MLM";
    Assert.assertEquals(2, StringModification.modify(str, 2));
  }
}
