package ua.happy.learning.prime;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Given some positive integer
 * Develop algorithm which return list with prime numbers
 * The product of that numbers should be equal given integer
 * For example: given 75, return list with 3, 5, 5 (5*5*3 = 75)
 */
public class FactorsTest {

    @Test
    @Order(1)
    void of_1_is_none() {
        assertThat(Factors.of(1), is(List.of()));
    }

    @Test
    @Order(2)
    void of_2_is_2() {
        assertThat(Factors.of(2), is(List.of(2)));
    }

    @Test
    @Order(3)
    void of_3_is_3() {
        assertThat(Factors.of(3), is(List.of(3)));
    }

    @Test
    @Order(4)
    void of_4_is_2x2() {
        assertThat(Factors.of(4), is(List.of(2, 2)));
    }

    @Test
    @Order(5)
    void of_6_is_3x2() {
        assertThat(Factors.of(6), is(List.of(2, 3)));
    }

    @Test
    @Order(6)
    void of_8_is_2x2x2() {
        assertThat(Factors.of(8), is(List.of(2,2,2)));
    }

    @Test
    @Order(7)
    void of_9_is_3x3() {
        assertThat(Factors.of(9), is(List.of(3,3)));
    }

    @Test
    @Order(8)
    void of_75_is_3x5x5() {
        assertThat(Factors.of(75), is(List.of(3,5,5)));
    }

    @Test
    @Order(9)
    void of_acceptance_test() {
        assertThat(Factors.of(2*2*2*3*3*5*7*11), is(List.of(2,2,2,3,3,5,7,11)));
    }
}
