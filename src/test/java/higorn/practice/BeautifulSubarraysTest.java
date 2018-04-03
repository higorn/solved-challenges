package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 03/04/18.
 */
public class BeautifulSubarraysTest {

    @Test
    public void itShouldCountBeautifulSubarrays() {
        int[] a = new int[] {2, 5, 4, 9};
        long count = BeautifulSubarrays.beautifulSubarrays(a, 1);
        Assert.assertEquals(6, count);
    }

    @Test
    public void itShouldCountBeautifulSubarrays2() {
        int[] a = new int[] {2, 5, 4, 9};
        long count = BeautifulSubarrays.beautifulSubarrays(a, 2);
        Assert.assertEquals(2, count);
    }
}
