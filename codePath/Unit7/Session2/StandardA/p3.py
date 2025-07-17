def count_checked_in_passengers(rooms):

    def binary_search(rooms,left,right):
        if left > right:
            return 0
        
        mid = left + right // 2

        if rooms[mid] == 1:
            return len(rooms[mid:])
        elif rooms[mid] == 0:
            left = mid + 1
            return binary_search(rooms,left,right)
        
    return binary_search(rooms,0 ,len(rooms)- 1)


rooms1 = [0, 0, 0, 1, 1, 1, 1]
rooms2 = [0, 0, 0, 0, 0, 1]
rooms3 = [0, 0, 0, 0, 0, 0]

print(count_checked_in_passengers(rooms1)) 
print(count_checked_in_passengers(rooms2))
print(count_checked_in_passengers(rooms3))
