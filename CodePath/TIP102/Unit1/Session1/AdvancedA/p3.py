def tiggerfy(word):
    lower = word.lower()
    str = ""
    for i in range(len(lower)):
        if lower[i] not in ("t", "i") and lower[i:i+2] not in ("gg", "er") and lower[i - 1 : i + 1] not in ("gg", "er"):
            str += lower[i]
    print(str)
    return str    
    


word = "Trigger"
tiggerfy(word)

word = "eggplant"
tiggerfy(word)

word = "Choir"
tiggerfy(word)
