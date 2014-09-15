import Data.List (union)

-- Add all the natural numbers below one
-- thousand that are multiples of 3 or 5.

soln = sum $ union [3,6..999] [5,10..999]
ans = show soln

main = do
  putStrLn $ "Solution: " ++ ans
