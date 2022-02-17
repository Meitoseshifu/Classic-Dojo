package ua.happy.learning.bowling;

import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Bowling game split into 10 frames
 * Each frame contains two roles
 * Your score for any given frame is the sum of the number pins you knock down with each of those roles
 * For example: you hit 2 pins with first role and 3 more with second - your score for that frame - 5
 * There two special situations:
 * 1. If u knock down 10 pins with 2 balls - it calls Spare. U get one more throw and score for that frame:
 *    10 + pins u hit in third throw
 * 2. If u knock down all 10 pins in first throw of the frame - it calls Strike. Strike counts:
 *    10 + number of pins u hit with the next 2 throws
 * 3. In a 10-th frame it is possible to hit Spare or Strike. In that case
 *    Spare - one additional Throw
 *    Strike - two additional Throws
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GameTest {
    private Game bowling;

    @BeforeEach
    void setUp() {
        bowling = new Game();
    }

    @Test
    @Order(1)
    public void can_score_gutter_game() {
        bowling.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowling.score(), is(0));
    }

    @Test
    @Order(2)
    void can_score_game_of_ones() {
        bowling.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(bowling.score(), is(20));
    }

    @Test
    @Order(3)
    void can_throw_spare_followed_by_three() {
        bowling.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowling.score(), is(16));
    }

    @Test
    @Order(4)
    void can_throw_strike_followed_three_then_three() {
        bowling.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(bowling.score(), is(22));
    }

    @Test
    @Order(5)
    void can_score_perfect_game() {
        bowling.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(bowling.score(), is(300));
    }
}
