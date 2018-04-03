package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 03/04/18.
 */
public class MakingAnagramsTest {

    @Test
    public void itShouldCountNeededDelections() {
        String a = "cde";
        String b = "abc";

        Assert.assertEquals(4, MakingAnagrams.numberNeeded(a, b));
    }

    @Test
    public void itShouldCountNeededDelections2() {
        String a = "bacdc";
        String b = "dcbad";

        Assert.assertEquals(2, MakingAnagrams.numberNeeded(a, b));
    }
}
