import com.github.zipcodewilmington.casino.Card;
import com.github.zipcodewilmington.casino.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class DeckTest {

    @Test
    public void createDeckTest(){
        //given: a deck will hold card objects
        ArrayList<Card> test = new ArrayList<>();
        //when: the deck is constructed
        for(Card.Suits suit : Card.Suits.values()){
            for(int i = 1; i <= 13; i++){
                //System.out.println(suit);
                test.add(new Card(i, suit));
                System.out.println("Card added: " + i + " of " + suit);
            }
        }
        //then: the deck contains 52 cards
        int expected = 52;
        int actual = test.size();

        Assert.assertEquals(expected, actual);
    }
}
