import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void put_1_return_1(){
        String expected = "1";
        String actual = fizzbuzz.say(1);
        assertEquals(expected,actual);
    }

    @Test
    public void put_2_return_2(){
        String expected = "2";
        String actual = fizzbuzz.say(2);
        assertEquals(expected,actual);
    }

    @Test
    public void put_3_return_Fizz(){
        String expected = "Fizz";
        String actual = fizzbuzz.say(3);
        assertEquals(expected,actual);
    }

    @Test
    public void put_4_return_4(){
        String expected = "4";
        String actual = fizzbuzz.say(4);
        assertEquals(expected,actual);
    }

}
