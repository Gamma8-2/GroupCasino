import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomGameTest {

    @Test
    public void getRandomNumberTest(){
        //given: A range of random numbers up to a certain bound
        Random test = new Random();
        int upperBound = 37;
        //when: A random number is generated
        int actual = test.nextInt(upperBound);
        System.out.println(actual);
        //then: The random number should be within the set range
        Assert.assertTrue(actual >= 0 && actual < 37);
    }
}
