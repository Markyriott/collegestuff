def repeating(str):
    if not str:
        return ""
    
    freq = {}
    for c in str:
        freq[c] = freq.get(c, 0) + 1

    for c in str:
        if freq.get(c) == 1:
            return c

print(repeating("google"))
print(repeating("barn"))
