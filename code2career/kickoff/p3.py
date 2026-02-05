def anagram(str_a, str_b):
    freq = {}

    for c in str_a:
        freq[c] = freq.get(c, 0) + 1

    for c in str_b:
        if not freq.get(c) or freq[c] == 0:
            return False

        freq[c] = freq[c] - 1

    if len(set(freq.values())) > 1:
        return False

    return True


print(anagram("google","oggloe"))
print(anagram("google","ogloe"))
print(anagram("google","ban"))
