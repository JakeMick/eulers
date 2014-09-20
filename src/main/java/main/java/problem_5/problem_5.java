package main.java.problem_5;

public class problem_5 {
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public static int ans() {
        return internal(20);
    }

    public static int internal(int n) {
        int c = n + 1;
        boolean found = false;
        while (true) {
            for (int i = 1; i < n + 1; i++) {
                if (c % i != 0) {
                    break;
                } else {
                    if (i == n) {
                        found = true;
                    }
                }
            }
            if (found) {
                break;
            } else {
                c += 1;
            }
        }
        return c;
    }
}
