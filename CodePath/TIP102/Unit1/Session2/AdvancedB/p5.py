#Understand: 
    #Input - Integer Array( nums )
    #Output - return all triplets that sum up to 0 and contains no duplicates
#Plan:
    #Three nested loops
    #create list to hold the triplets
    #for i in range(len(nums)):
        #for j in range(i + 1, len(nums[i+1:])):
            #for k in range(j+1, len(nums[j+1:])):
                #if nums[j] + nums[k] + nums[i] == 0:
                    #list.append([nums[j], nums[i], nums[k]])

def three_sum(nums):
    triplets = []

    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            for k in range(j + 1, len(nums)):
                if nums[i] + nums[j] + nums[k] == 0:
                    triplets.append([nums[i], nums[j], nums[k]])
    return triplets

nums = [-1, 0, 1, 2, -1, -4]
three_sum(nums)

nums = [0, 1, 1]
three_sum(nums)

nums = [0, 0, 0]
three_sum(nums)

#CodePath Solution: Two-Pointers
# def three_sum(nums):
#     nums.sort()
#     result = []
    
#     for i in range(len(nums) - 2):
#         if i > 0 and nums[i] == nums[i - 1]:  # Skip duplicate values for i
#             continue
#         left, right = i + 1, len(nums) - 1
        
#         while left < right:
#             total = nums[i] + nums[left] + nums[right]
#             if total == 0:
#                 result.append([nums[i], nums[left], nums[right]])
#                 while left < right and nums[left] == nums[left + 1]:  # Skip duplicates for left
#                     left += 1
#                 while left < right and nums[right] == nums[right - 1]:  # Skip duplicates for right
#                     right -= 1
#                 left += 1
#                 right -= 1
#             elif total < 0:
#                 left += 1
#             else:
#                 right -= 1
    
#     return result