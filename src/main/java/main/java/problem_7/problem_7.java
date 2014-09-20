package main.java.problem_7;

import main.java.primes.primes;

public class problem_7 {
    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10001st prime number?

    104743
     */
    public static int ans() {
        return primes.nth_prime(10001);
    }
}
