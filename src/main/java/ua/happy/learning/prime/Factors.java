package ua.happy.learning.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * Given some positive integer
 * Develop algorithm which return list with prime numbers
 * The product of that numbers should be equal given integer
 * For example: given 75, return list with 3, 5, 5 (5*5*3 = 75)
 */
public class Factors {
    /*public static List<Integer> of(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        int divisor = 2;
        while (number > 1) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }

        return primeFactors;
    }*/

    public static List<Integer> of(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int divisor = 2; number > 1; divisor++)
            for (; number % divisor == 0; number /= divisor)
                primeFactors.add(divisor);

        return primeFactors;
    }
}
