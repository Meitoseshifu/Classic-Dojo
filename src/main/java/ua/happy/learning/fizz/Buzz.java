package ua.happy.learning.fizz;

/**
 * Given an integer greater than or equal to zero
 * if divisible by 3, return "Fizz"
 * if divisible by 5, return "Buzz"
 * if divisible by 3 & 5 return "FizzBuzz"
 * if none og the above, return index
 */
public class Buzz {

    private static final String ZERO = "0";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";


    public static String of(int digit) {
        if(digit == 0) return ZERO;
        if(isFizz(digit) && isBuzz(digit)) return FIZZBUZZ;
        if(isFizz(digit)) return FIZZ;
        if(isBuzz(digit)) return BUZZ;
        return String.valueOf(digit);
    }

    /*public static String of(int digit) {
        if(digit == 0) return "0";

        String result = "";

        if(isFizz(digit))
            result += "Fizz";
        if(isBuzz(digit))
            result += "Buzz";

        return result.isEmpty() ? String.valueOf(digit) : result;
    }*/

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }
}
