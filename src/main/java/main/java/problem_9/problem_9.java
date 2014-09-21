package main.java.problem_9;

public class problem_9 {
    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a^2 + b^2 = c^2

    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
    */

    public static int internal(int x) {
        int out = 0;
        for (int i = 1; i < x / 3; i++) {
            for (int j = i + 1; j < x / 2; j++) {
                int k = x - i - j;
                if (i * i + j * j == k * k) {
                    out = i * j * k;
                    break;
                }
            }
        }
        return out;
    }

    public static int ans() {
        return internal(1000);
    }
}
