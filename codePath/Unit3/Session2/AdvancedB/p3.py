def match_buyers_and_sellers(buyers, sellers):
    buyers.sort()
    sellers.sort()

    count = 0
    p1=p2 = 0

    while p1 < len(buyers) and p2 < len(sellers):
        if buyers[p1] >= sellers[p2]:
            count += 1
            p1 += 1
            p2 += 1
        else:
            p2 += 1

    return count
    


buyers1 = [4, 7, 9]
sellers1 = [8, 2, 5, 8]
print(match_buyers_and_sellers(buyers1, sellers1)) 

buyers2 = [1, 1, 1]
sellers2 = [10]
print(match_buyers_and_sellers(buyers2, sellers2))
