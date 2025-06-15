#helped

from collections import deque

def reveal_attendee_list_in_order(attendees):
    sortedlist = sorted(attendees)
    queue = deque()

    for i in range(len(sortedlist) - 1 , -1 , -1):
        if queue:
            queue.appendleft(queue.pop())
        queue.appendleft(sortedlist[i])
    return list(queue)


print(reveal_attendee_list_in_order([17,13,11,2,3,5,7])) 
print(reveal_attendee_list_in_order([1,1000]))  