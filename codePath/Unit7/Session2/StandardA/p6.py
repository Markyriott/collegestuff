'''
Understand:
    input: matrix and int target (treasure)
    output: tuple with two elements representing the row and column of the target
Match:
    divide and conquer
    since it's sorted do binary search on the m row that would contain the target
Plan: 
    for i,v in enumerate(matrix):
        if matrix[i][0] < target and matrix[i][-1] > target:
            result = recursive binary search()
            return result
    
'''
def find_treasure(matrix, treasure):
    for i, v in enumerate(matrix):
        col = bin_search(v,treasure,0,len(v)-1)
        if col != -1:
            return (i,col)
    return (-1,-1)

def bin_search(arr,target,left,right):
    if left >= right:
        return -1
    
    mid = (left + right) // 2

    if arr[mid] == target:
        return mid
    elif arr[left] > target:
        return bin_search(arr,target,left, mid)
    elif arr[left] < target:
        return bin_search(arr,target,mid + 1, right)

rooms = [
    [1, 4, 7, 11],
    [8, 9, 10, 20],
    [11, 12, 17, 30],
    [18, 21, 23, 40]
]

print(find_treasure(rooms, 17))
print(find_treasure(rooms, 5))
