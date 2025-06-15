def rearrange_guests(guests):
    pos_queue = []
    neg_queue = []
    result = []

    for i in range(len(guests)):
        if guests[i] > 0:
            pos_queue.append(guests[i])
        elif guests[i] < 0:
            neg_queue.append(guests[i])

    for i in range(len(pos_queue)):
        result.append(pos_queue[i])
        result.append(neg_queue[i])

    return result


print(rearrange_guests([3,1,-2,-5,2,-4]))  
print(rearrange_guests([-1,1])) 