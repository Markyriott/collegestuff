#Understand:
    #Input - sorted list of integers (nums) and an integer (target)
    #Output - Return the indices of the two numbers that add up to target
        #Do not use the same element twice
#Plan: 
    #Have to use Two-Pointer
    #while left < right:
        #if nums[left] + nums[right] == taget:
            #return [left, right]
        #elif nums[left] + nums[right] < target:
            #left += 1
        #elif nums[left] +nums[right] > target:
            #right -= 1
    #return []

def two_sum(nums, target):
    left, right = 0, len(nums) - 1

    while left < right:
        if nums[left] + nums[right] == target: 
            return [left, right]
        elif nums[left] + nums[right] < target:
            left += 1
        elif nums[left] + nums[right] > target:
            right -= 1
    return []

nums = [2, 7, 11, 15]
target = 9
two_sum(nums, target)

nums = [2, 7, 11, 15]
target = 18
two_sum(nums, target)
