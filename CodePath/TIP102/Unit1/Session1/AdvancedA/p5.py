def find_missing_clues(clues, lower, upper):
    missing = []

    for i in range(len(clues) - 1):
        if clues[i + 1] - clues[i] > 1: 
            missing.append([clues[i] + 1, clues[i + 1] - 1])
        
        if i + 1 == len(clues) - 1 and clues[-1] != upper:
             missing.append([clues[-1] + 1, upper])

    return missing


clues = [0, 1, 3, 50, 75]
lower = 0
upper = 99
find_missing_clues(clues, lower, upper)

clues = [-1]
lower = -1
upper = -1
find_missing_clues(clues, lower, upper)
