package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 03/04/18.
 */
public class RansonNoteTest {

    @Test
    public void itShouldReturnTrue() {
        String[] magazine = new String[] {"give", "me", "one", "grand", "today", "night"};
        String[] ransom = new String[] {"give", "one", "grand", "today"};
        Assert.assertTrue(RansonNote.canCreate(magazine, ransom));
    }

    @Test
    public void itShouldReturnFalse() {
        String[] magazine = new String[] {"two", "times", "three", "is", "not", "four", "not"};
        String[] ransom = new String[] {"two", "times", "two", "is", "four"};
        Assert.assertFalse(RansonNote.canCreate(magazine, ransom));
    }
}
