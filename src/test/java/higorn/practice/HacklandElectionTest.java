package higorn.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by higor on 03/04/18.
 */
public class HacklandElectionTest {

    @Test
    public void itShouldShowTheWinner() {
        String[] votes = {"Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica"};
        String winner = HancklandElection.electionWinner(votes);
        Assert.assertEquals("Veronica", winner);
    }
}
