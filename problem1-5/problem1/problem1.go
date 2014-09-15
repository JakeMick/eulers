package main

func main() {
    ans := 0
    for i := 0; i < 1000; i++ {
        if i % 3 == 0 {
            ans += i
        } else if i % 5 == 0 {
            ans += i
        }
    }
    println("Solution:", ans)
}

