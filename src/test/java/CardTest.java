import com.github.zipcodewilmington.casino.Card;
import org.junit.Assert;
import org.junit.Test;

import static com.github.zipcodewilmington.casino.Card.Suits.*;
import static com.github.zipcodewilmington.casino.CardDefaultEnum.*;

public class CardTest {

    @Test
    public void constructCardTest(){

        Card test = new Card(TWO, HEARTS, 2);
        String actual = test.getCardValue() + " of " +
                test.getCardSuit();

        String expected = "2 of HEARTS";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructCardTest2(){

        Card test = new Card(SEVEN, CLUBS, 7);
        String actual = test.getCardValue() + " of " +
                test.getCardSuit();

        String expected = "7 of CLUBS";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardSuitTest(){
        Card test = new Card(TEN, SPADES, 10);

        String expected = "SPADES";
        String actual = test.getCardSuit().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardSuitTest2(){
        Card test = new Card(ACE, HEARTS, 14);

        String expected = "HEARTS";
        String actual = test.getCardSuit().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardValueTest(){
        Card test = new Card(FIVE, DIAMONDS, 5);

        Integer expected = 5;
        Integer actual = test.getCardValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCardValueTest2(){
        Card test = new Card(QUEEN, CLUBS, 12);

        Integer expected = 12;
        Integer actual = test.getCardValue();

        Assert.assertEquals(expected, actual);
    }


}
