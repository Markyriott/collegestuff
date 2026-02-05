from collections import deque

def day9(input):
    index_dict = {}
    matrix = []
    location_index = 0

    for s in open(input):
        data = s.split()

        if index_dict.get(data[0]) is None:
            matrix.append([0] * 8)
            index_dict[data[0]] = location_index
            location_index += 1
        
        if index_dict.get(data[2]) is None:
            matrix.append([0] * 8)
            index_dict[data[2]] = location_index
            location_index += 1
            
        matrix[index_dict[data[0]]][index_dict[data[2]]] = int(data[4])
        matrix[index_dict[data[2]]][index_dict[data[0]]] = int(data[4])

    queue = deque((0,0,0))

    visited = set()

    while queue:
        location = queue.popleft()
        if location[0] == len(matrix - 1):



day9('p9.txt')

