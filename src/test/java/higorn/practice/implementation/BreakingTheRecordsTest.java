package higorn.practice.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 23/04/18.
 */
public class BreakingTheRecordsTest {

    @Test
    public void itShouldReturnNumberOfHigestAndLowerScore() {
        int[] score = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] recordsCount = BreakingTheRecords.breakingRecords(score);
        Assert.assertEquals(2, recordsCount[0]);
        Assert.assertEquals(4, recordsCount[1]);
    }

    @Test
    public void itShouldReturnNumberOfHigestAndLowerScoreCase2() {
        int[] score = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] recordsCount = BreakingTheRecords.breakingRecords(score);
        Assert.assertEquals(4, recordsCount[0]);
        Assert.assertEquals(0, recordsCount[1]);
    }
}
