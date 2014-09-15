import Data.List

x = [100..999]
xs = map show $ sort [i * j | i <- x, j <- x]
results = reverse $ filter (\i -> i == reverse i) xs
main = putStrLn $ results !! 0

