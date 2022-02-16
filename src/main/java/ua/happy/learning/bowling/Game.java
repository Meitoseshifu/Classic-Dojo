package ua.happy.learning.bowling;

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
public class Game {
}
