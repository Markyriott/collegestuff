def sort_by_parity(nums):
    even = []
    odd = []

    for num in nums:
        if num % 2 == 0:
            even.append(num)
        elif num % 2 != 0:
            odd.append(num)
    
    return even + odd

nums = [3, 1, 2, 4]
sort_by_parity(nums)

nums = [0]
sort_by_parity(nums)

#CodePath's two-pointer solution:
# def sort_by_parity(nums):
#     left = 0
#     right = len(nums) - 1
    
#     while left < right:
#         if nums[left] % 2 > nums[right] % 2:
#             nums[left], nums[right] = nums[right], nums[left]
        
#         if nums[left] % 2 == 0:
#             left += 1
#         if nums[right] % 2 == 1:
#             right -= 1
    
#     return nums