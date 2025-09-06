def count_checked_in_passengers(rooms):

    def binary_search(rooms,left,right,first):
        if left > right:
            return len(rooms[first:])
        
        mid = left + (right-left) // 2

        if rooms[mid] == 1:
            first = mid
            right = mid - 1
            return binary_search(rooms,left,right,first)
        elif rooms[mid] == 0:
            left = mid + 1
            return binary_search(rooms,left,right,first)
        
    return binary_search(rooms,0 ,len(rooms)- 1,len(rooms))

rooms1 = [0, 0, 0, 1, 1, 1, 1]
rooms2 = [0, 0, 0, 0, 0, 1]
rooms3 = [0, 0, 0, 0, 0, 0]
#rooms3 = [0,1,1,1,1,1,1,1,1]
print(count_checked_in_passengers(rooms1)) 
print(count_checked_in_passengers(rooms2))
print(count_checked_in_passengers(rooms3))
