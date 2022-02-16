package ua.happy.learning.fizz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Given an integer greater than or equal to zero
 * if divisible by 3, return "Fizz"
 * if divisible by 5, return "Buzz"
 * if divisible by 3 & 5 return "FizzBuzz"
 * if none og the above, return index
 */
public class BuzzTest {

    @Test
    public void of_0_is_0() {
        assertThat(Buzz.of(0), is("0"));
    }

    @Test
    public void of_1_is_1() {
        assertThat(Buzz.of(1), is("1"));
    }

    @Test
    public void of_3_is_Fizz() {
        assertThat(Buzz.of(3), is("Fizz"));
    }

    @Test
    public void of_6_is_Fizz() {
        assertThat(Buzz.of(6), is("Fizz"));
    }

    @Test
    public void of_5_is_Buzz() {
        assertThat(Buzz.of(5), is("Buzz"));
    }

    @Test
    public void of_10_is_Buzz() {
        assertThat(Buzz.of(10), is("Buzz"));
    }

    @Test
    public void of_15_is_FizzBuzz() {
        assertThat(Buzz.of(15), is("FizzBuzz"));
    }

}
