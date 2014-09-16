package main.java.problem_4;

public class problem_4 {
    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
     */

    public static int ans() {
        return internal(3);
    }

    public static int internal(int n) {
        int largest = 0;
        int temp;
        String temp_s;
        String temp_sr;
        for (int i = 1; i < (int) Math.pow(10, n); i++) {
            for (int j = 1; j < (int) Math.pow(10, n); j++) {
                temp = i * j;
                temp_s = Integer.toString(temp);
                temp_sr = new StringBuilder(temp_s).reverse().toString();
                if (temp_s.equals(temp_sr)) {
                    if (temp > largest) {
                        largest = temp;
                    }
                }
            }
        }
        return largest;
    }
}
