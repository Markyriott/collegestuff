def remove_dupes(items):
    if not items:
        return 0
    
    i = 0 

    for j in range(1, len(items)):
        if items[j] != items[i]:
            i += 1
            items[i] = items[j]

    return i + 1

items = ["extract of malt", "haycorns", "honey", "thistle", "thistle"]
remove_dupes(items)

items = ["extract of malt", "haycorns", "honey", "thistle"]
remove_dupes(items)
