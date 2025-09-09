def find_shallowest_point(arr):
    def find_min(left = 0,right = len(arr) - 1):
        if left == right:
            return arr[left]
        
        midpoint = (left + right) // 2

        left_min = find_min(left,midpoint)
        right_min = find_min(midpoint + 1, right)

        return min(left_min, right_min)
    
    return find_min()
print(find_shallowest_point([5, 7, 2, 8, 3]))
print(find_shallowest_point([12, 15, 10, 21]))
