def find_cabin_index(cabins, preferred_deck):

    def binary_search(left,right):
        if left >= right:
            return left if preferred_deck < cabins[right] else right + 1
        
        midpoint = (right + left) // 2

        if cabins[midpoint] == preferred_deck:
            return midpoint
        elif cabins[midpoint] > preferred_deck:
            return binary_search(left,midpoint)
        elif cabins[midpoint] < preferred_deck:
            return binary_search(midpoint + 1, right)
    
    return binary_search(0, len(cabins) - 1)

print(find_cabin_index([1, 3, 5, 6], 5))
print(find_cabin_index([1, 3, 5, 6], 2))
print(find_cabin_index([1, 3, 5, 6], 7))
