#! /usr/bin/env js
// Add all the natural numbers below one
// thousand that are multiples fo 3 or 5.
var d = 0;
for (i=1;i<1000;i++){
    if (i % 3 === 0){
        d += i;
    }
    else if (i % 5 === 0){
        d += i;
    }
}
console.log("Solution: " + String(d));
