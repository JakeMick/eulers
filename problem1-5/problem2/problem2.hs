-- By considering the terms in the Fibonacci sequence whose
-- values do not exceed four million, find the sum of the
-- even-valued terms.
soln = sum [x | x <- takeWhile (<= 4000000) fib, even x]
  where
    fib = 1 : 1 : zipWith (+) fib (tail fib)
ans = show soln

main = do
  putStrLn $ "Solution: " ++ ans
