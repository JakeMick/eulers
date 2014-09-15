#!/usr/bin/env python
# Add all the natural numbers below one
# thousand that are multiples of 3 or 5.
def soln():
    ans = sum([i for i in xrange(1,1000) if (i % 5 == 0) or (i % 3 == 0)])
    print("Solution: {0}".format(ans))


if __name__ == "__main__":
    soln()
