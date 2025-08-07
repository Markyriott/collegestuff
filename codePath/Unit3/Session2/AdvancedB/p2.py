def arrange_magical_orbs(orbs):
    left,i, right = 0, 1,len(orbs) - 1

    while i < right:
        if orbs[i] == 0:
            orbs[i],orbs[left] = orbs[left],orbs[i]
            left += 1
        
        if orbs[i] == 2:
            orbs[i],orbs[right] = orbs[right],orbs[i]
            right -= 1
        
        i+=1
    return orbs

orbs1 = [2, 0, 2, 1, 1, 0]
arrange_magical_orbs(orbs1)
print(orbs1) 

orbs2 = [2, 0, 1]
arrange_magical_orbs(orbs2)
print(orbs2) 