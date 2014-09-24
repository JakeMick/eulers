package main.java.primes;

import java.util.ArrayList;

public class primes {
    public static int nth_prime(int n) {
        int cur = 2;

        int counter = 4;

        while (cur < n) {
            if (counter % 2 != 0 && counter % 3 != 0) {
                int temp = 4;
                while (temp * temp <= counter) {
                    if (counter % temp == 0) {
                        break;
                    }
                    temp++;
                }
                if (temp * temp > counter) {
                    cur += 1;
                }
            }
            counter++;
        }
        return counter - 1;
    }

    public static ArrayList<Integer> primes_below(int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>(x);
        arr.add(2);
        arr.add(3);

        int counter = 4;

        while (true) {
            if (counter % 2 != 0 && counter % 3 != 0) {
                int temp = 4;
                while (temp * temp <= 0) {
                    if (counter % temp == 0) {
                        break;
                    }
                    temp++;
                }
                if (temp * temp > counter) {
                    if (counter > x)
                        break;
                    else {
                        arr.add(counter);
                    }
                }
            }
            counter++;
        }
        return arr;
    }
}
