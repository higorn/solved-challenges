package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 05/04/18.
 */
public class BalancedBracketsTest {

    @Test
    public void itShouldValidateBalancedBrackets() {
        String brackets = "{[()]}";
        Assert.assertTrue(BalancedBrackets.isBalanced(brackets));
    }

    @Test
    public void itShouldValidateBalancedBracketsCase2() {
        String brackets = "{{[[(())]]}}";
        Assert.assertTrue(BalancedBrackets.isBalanced(brackets));
    }

    @Test
    public void itShouldValidateUnbalancedBrackets() {
        String brackets = "{[(])}";
        Assert.assertFalse(BalancedBrackets.isBalanced(brackets));
    }

    @Test
    public void itShouldValidateUnbalancedBracketsCase2() {
        String brackets = "]})))))";
        Assert.assertFalse(BalancedBrackets.isBalanced(brackets));
    }
}
