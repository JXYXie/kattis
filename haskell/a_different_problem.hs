solve [] = []
solve (fst:snd:rest) = (abs(fst - snd):(solve rest))


readInput = (map read) . words
writeOutput = unlines . (map show)

main = interact (writeOutput . solve . readInput)