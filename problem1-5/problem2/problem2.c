#include <stdio.h>

int main(int argc, const char* argv[]) {
    int fib_ini = 1;
    int fib_dos = 2;
    int fib_tres;
    int ans = 0;
    int max = 4000000;
    while (fib_dos < max) {
        if (fib_dos % 2 == 0) {
            ans += fib_dos;
        }
        fib_tres = fib_ini + fib_dos;
        fib_ini = fib_dos;
        fib_dos = fib_tres;
    }
    printf("Solution: %d\n", ans);
    return 0;
}
