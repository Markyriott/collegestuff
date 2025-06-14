def arrange_guest_arrival_order(arrival_pattern):
    stack = []
    result = [''] * (len(arrival_pattern) + 1)
    count = 1

    for i in range(len(arrival_pattern)):
        stack.append(i)
        if arrival_pattern[i] == "I":
            while stack:
                temp = stack.pop()
                result[temp] = str(count)
                count+= 1

    stack.append(len(arrival_pattern))
    
    while stack:
        temp = stack.pop()
        result[temp] = str(count)
        count+= 1

    return result
        



    

print(arrange_guest_arrival_order("IIIDIDDD"))  
print(arrange_guest_arrival_order("DDD"))  