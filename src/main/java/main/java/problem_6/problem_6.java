package main.java.problem_6;

public class problem_6 {
    /*
    The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + .. + 10^2 = 385

    The square of the sum of the first ten natural numbers is,
    (1 + 2 + .. + 10)^2 = 55^2 = 3025

    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */

    public static long ans() {
        return internal(100);
    }

    public static long internal(long x) {
        // sum of the squares
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum += i * i;
        }
        //square of sum
        long sq_sum = 0;
        for (long i = 1; i <= x; i++) {
            sq_sum += i;
        }
        return (sq_sum * sq_sum) - sum;
    }

}
