package teampun_ther;

import org.junit.Test;
import org.junit.Assert;

public class CardTest {

    @Test
    public void getValueTest(){
        Card card = new Card(12, Suit.CLUB);

        Integer expected = 12;

        Integer actual = card.getValue();

        Assert.assertEquals(expected,actual);

    }
}