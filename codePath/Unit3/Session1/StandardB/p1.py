from collections import deque

def time_required_to_stream(movies,k):
    queue = deque()
    time = 0

    for index, number in enumerate(movies):
        queue.append((number, index))
    
    while queue:
        front = queue.popleft()
        time += 1

        if front[0] == 1 and front[1] == k:
            return time
        elif front[0] > 1:
            queue.append((front[0] - 1, front[1]))
        

    
    



print(time_required_to_stream([2, 3, 2], 2)) 
print(time_required_to_stream([5, 1, 1, 1], 0)) 