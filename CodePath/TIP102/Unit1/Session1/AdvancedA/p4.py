def non_decreasing(nums):
    count = 0

    for i in range(len(nums) - 1):
        if nums[i] > nums[i+1]:
            count += 1
        if count > 1:
            return False
        
    return True
        
nums = [4, 2, 3]
non_decreasing(nums)

nums = [4, 2, 1]
non_decreasing(nums)
