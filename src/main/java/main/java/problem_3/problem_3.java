package main.java.problem_3;

import java.util.ArrayList;

public class problem_3 {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143?
     */
    public static long ans() {
        long n = 600851475143L;
        return internal(n);
    }

    public static long internal(long x) {
        ArrayList<Long> array = new ArrayList<Long>();
        long d = 2;
        while (true) {
            while (x % d == 0) {
                array.add(d);
                x /= d;
            }

            d += 1;
            if (d * d > x) {
                if (x > 1) {
                    array.add(x);
                }
                break;
            }
        }
        return max(array);
    }

    private static long max(ArrayList<Long> xs) {
        long out = xs.get(0);
        long maybe;
        for (int i = 1; i < xs.size(); i++) {
            maybe = xs.get(i);
            if (maybe > out) {
                out = maybe;
            }
        }
        return out;
    }
}
