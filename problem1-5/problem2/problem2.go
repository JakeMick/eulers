package main

func main() {
    fib_ini := 1
    fib_dos := 2
    ans := 0
    for fib_dos < 4000000 {
        if fib_dos % 2 == 0 {
            ans += fib_dos
        }
        fib_tres := fib_ini + fib_dos
        fib_ini = fib_dos
        fib_dos = fib_tres
    }
    println("Solution:", ans)
}

