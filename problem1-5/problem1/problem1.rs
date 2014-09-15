fn main() {
    let mut i = 0;
    let mut ans = 0;
    loop {
        i += 1;
        if i >= 1000 {
            break;
        }
        if (i % 3) == 0 {
            ans += i
        }
        else if (i % 5) == 0 {
            ans += i
        }
    }
    println(fmt!("Solution %?", ans));
}
