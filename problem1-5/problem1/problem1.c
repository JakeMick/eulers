#include <stdio.h>
/* Add all the natural numbers below one
 * thousand that are multiples of 3 or 5 */
int main()
{
    int i;
    int ans = 0;
        for (i = 1; i<1000; i++) {
            if (i % 3 == 0){
                ans += i;
            }
            else if (i % 5 == 0) {
                ans += i;
            }}
    printf("Solution: %d\n", ans);
}
