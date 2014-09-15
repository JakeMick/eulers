#!/usr/bin/env js

// By considering the terms in the Fibonacci sequence whose
// values do not exceed four million, find the sum of the
// even-valued terms.

function fourMillionEvenFibs(){
    var ans = 0;
    var fib_plus_two = 2;
    var fib_plus_one = 1;
    while (fib_plus_two < 4000000) {
        if (fib_plus_two % 2 === 0) {
            ans += fib_plus_two;
        }
        var n_plus_one = fib_plus_one + fib_plus_two;
        fib_plus_one = fib_plus_two;
        fib_plus_two = n_plus_one;
    }
    return ans;
}
console.log("Solution: " + fourMillionEvenFibs());
