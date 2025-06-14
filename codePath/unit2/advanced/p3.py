def find_duplicate_chests(chests):
    quantity = {}
    for n in chests:
        if quantity.get(n):
            quantity[n] = quantity[n] + 1
        else: quantity[n] = 1
    return [x for x in quantity if quantity[x] > 1]

chests1 = [4, 3, 2, 7, 8, 2, 3, 1]
chests2 = [1, 1, 2]
chests3 = [1]

print(find_duplicate_chests(chests1))
print(find_duplicate_chests(chests2))
print(find_duplicate_chests(chests3))
