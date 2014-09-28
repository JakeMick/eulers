package main.java.problem_10;

import java.util.ArrayList;

public class problem_10 {
    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
    142913828922
    */
    public static long internal(int n) {
        long ans = 0L;

        if (n < 2) {
            ans = 0L;
        } else {
            if (n == 2) {
                ans = 2L;
            } else {
                ArrayList<Boolean> cache = new ArrayList<Boolean>(n + 1);
                for (int i = 0; i < n; i++) {
                    cache.add(true);
                }
                for (int i = 2; i < n; i++) {
                    if (cache.get(i)) {
                        ans += (long) i;
                        for (int j = i; j < n; j += i) {
                            cache.set(j, false);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static long ans() {
        return internal(2000000);
    }
}
