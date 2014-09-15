fn main() {
    let mut ans = 0;
    let mut fib_one = 1;
    let mut fib_two = 2;
    let mut fib_tres;
    while (fib_two < 4000000) {
        if (fib_two % 2 == 0) {
            ans += fib_two
        }
        fib_tres = fib_two + fib_one;
        fib_one = fib_two;
        fib_two = fib_tres;
    };
    println(fmt!("Solution %?", ans));
}
