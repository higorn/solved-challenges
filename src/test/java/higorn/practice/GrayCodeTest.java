package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

public class GrayCodeTest {
    @Test
    public void itShouldConvertBinaryToGrayCase1() {
        int b = 4;
        Assert.assertEquals(6, GreyCodeUtils.toGray(b));
    }
    @Test
    public void itShouldConvertBinaryToGrayCase2() {
        int b = 0b0100;
        Assert.assertEquals(0b0110, GreyCodeUtils.toGray(b));
    }
    @Test
    public void itShouldConvertGrayToBinaryCase1() {
        int g = 0b0110;
        Assert.assertEquals(0b0100, GreyCodeUtils.toBinary(g));
    }
    @Test
    public void itShouldConvertGrayToBinaryCase2() {
        int g = 6;
        Assert.assertEquals(4, GreyCodeUtils.toBinary(g));
    }
    @Test
    public void itShouldConvertGrayToBinary32Bits() {
        int g = 6;
        Assert.assertEquals(4, GreyCodeUtils.toBinary32(g));
    }
}
