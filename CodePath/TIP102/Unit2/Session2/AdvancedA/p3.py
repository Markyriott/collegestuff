'''
def organize_exhibition(collection):
    seen = set()
    res = [[]]

    for s in collection:
        if s in seen:
            res.append([])
            res[len(res) - 1].append(s)
        else:
            res[0].append(s)
            seen.add(s)
    return res
'''

def organize_exhibition(collection):
    freq = {}

    for s in collection:
        freq[s] = freq.get(s, 0) + 1

    res = [[] for _ in range(max(freq.values()))]

    for s in freq.items():
        for i in range(s[1]):
            res[i].append(s[0])

    return res

collection1 = ["O'Keefe", "Kahlo", "Picasso", "O'Keefe", "Warhol", 
              "Kahlo", "O'Keefe"]
collection2 = ["Kusama", "Monet", "Ofili", "Banksy"]

print(organize_exhibition(collection1))
print(organize_exhibition(collection2))

