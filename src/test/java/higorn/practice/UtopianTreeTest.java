package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 03/04/18.
 */
public class UtopianTreeTest {

    @Test
    public void itShouldGrowBy1Cycle() {
        int growth = UtopianTree.getGrowth(1);
        Assert.assertEquals(2, growth);
    }

    @Test
    public void itShouldGrowBy4Cycle() {
        int growth = UtopianTree.getGrowth(4);
        Assert.assertEquals(7, growth);
    }
}
