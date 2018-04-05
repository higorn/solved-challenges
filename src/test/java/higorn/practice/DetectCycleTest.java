package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 04/04/18.
 */
public class DetectCycleTest {

    @Test
    public void forUncycledNodeItShouldReturnFalse() {
        DetectCycle.Node node = new DetectCycle.Node();
        Assert.assertFalse(DetectCycle.hasCycle(node));
    }

    @Test
    public void forCycledNodeItShouldReturnTrue() {
        DetectCycle.Node node = new DetectCycle.Node();
        DetectCycle.Node node2 = new DetectCycle.Node();
        node.setNext(node2);
        node2.setNext(node);
        Assert.assertTrue(DetectCycle.hasCycle(node));
    }
}
