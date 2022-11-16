import com.github.zipcodewilmington.casino.Card;
import org.junit.Assert;
import org.junit.Test;

import static com.github.zipcodewilmington.casino.Card.Suits.*;

public class CardTest {

    @Test
    public void constructCardTest(){

        Card test = new Card(2, HEARTS);
        String actual = test.getCardValue() + " of " +
                test.getCardSuit();

        String expected = "2 of HEARTS";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructCardTest2(){

        Card test = new Card(7, CLUBS);
        String actual = test.getCardValue() + " of " +
                test.getCardSuit();

        String expected = "7 of CLUBS";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardSuitTest(){
        Card test = new Card(10, SPADES);

        String expected = "SPADES";
        String actual = test.getCardSuit().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardSuitTest2(){
        Card test = new Card(1, HEARTS);

        String expected = "HEARTS";
        String actual = test.getCardSuit().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardValueTest(){
        Card test = new Card(5, DIAMONDS);

        Integer expected = 5;
        Integer actual = test.getCardValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardValueTest2(){
        Card test = new Card(12, CLUBS);

        Integer expected = 12;
        Integer actual = test.getCardValue();

        Assert.assertEquals(expected, actual);
    }


}
