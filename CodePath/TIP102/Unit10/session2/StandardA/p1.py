from collections import deque
def can_rebook(flights, source, dest):
    queue = deque([source])

    while queue:
        row = queue.popleft()
        for i in range(len(flights[row])):
            if flights[row][i] == 1:
                if i == dest:
                    return True
                queue.append(i)

    return False
flights1 = [
    [0, 1, 0], # Flight 0
    [0, 0, 1], # Flight 1
    [0, 0, 0]  # Flight 2
]

flights2 = [
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [0, 0, 0, 0, 1],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0]
]

print(can_rebook(flights1, 0, 2))
print(can_rebook(flights2, 0, 2)) 
