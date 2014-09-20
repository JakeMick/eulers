package main.java.primes;

import java.util.ArrayList;

public class primes {
    public static int nth_prime(int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>(x);
        arr.add(2);
        arr.add(3);

        int counter = 4;

        while (arr.size() < x) {
            if (counter % 2 != 0 && counter % 3 != 0) {
                int temp = 4;
                while (temp * temp <= counter) {
                    if (counter % temp == 0) {
                        break;
                    }
                    temp++;
                }
                if (temp * temp > counter) {
                    arr.add(counter);
                }
            }
            counter++;
        }
        return arr.get(arr.size() - 1);
    }
}
