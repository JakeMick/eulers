#!/usr/bin/env python
# By considering the terms in the Fib sequence whose
# values do not exceed four million, find the sum of
# the even-valued terms.

def soln(n=4000000):
    ans = 0
    fib_ini = 1
    fib_dos = 2
    while fib_dos < n:
        if fib_dos % 2 == 0:
            ans += fib_dos
        fib_tres = fib_ini + fib_dos
        fib_ini = fib_dos
        fib_dos = fib_tres
    print("Solution: {0}".format(ans))

if __name__ == "__main__":
    soln()
