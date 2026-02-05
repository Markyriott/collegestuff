from collections import deque

def snake_size(arr, index):
    if not arr:
        return 0

    arr_length = len(arr)

    for i, v in enumerate(arr):
        left = snake_size(arr ) if i > 0 and arr[i][i - 1] == v + 1 or arr[i][i - 1] == v - 1 else 0
        right = snake_size(arr, i) if i < arr_length and arr[i][i + 1] == v + 1 or arr[i][i + 1] == v - 1 else 0
        up = snake_size() if i > 0 and arr[i - 1][i] == v + 1 or arr[i - 1][i] == v - 1 else 0
        down = snake_size() if i < arr_length and arr[i + 1][i] == v + 1 or arr[i + 1][i] == v - 1 else 0

    max_length = max(left,right,up,down)
    return max_length


matrix = [[8,2,1],
          [4,3,6],
          [9,5,7]]

print(snake_size(matrix))
