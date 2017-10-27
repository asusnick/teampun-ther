package teampun_ther;

import org.junit.Assert;
import org.junit.Test;

public class SuitTest {

    @Test
    public void getSuitTest(){
        Card card = new Card(12, Suit.CLUB);

        Suit expected = Suit.CLUB;

        Suit actual = card.getSuit();

        Assert.assertEquals(expected,actual);
    }
}