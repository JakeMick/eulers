package main.java.problem_10;

import main.java.primes.primes;

import java.util.ArrayList;

public class problem_10 {
    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
    142913828922
    */
    public static int internal(int n) {
        ArrayList<Integer> arr = primes.primes_below(n);
        int out = 0;
        for (int i = 0; i < arr.size(); i++)
            out += arr.get(i);
        return out;
    }

    public static int ans() {
        return internal(200);
    }
}
