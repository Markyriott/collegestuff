#Understand:
    #Input - integer array(height)
    #Expected Output - Integer representing the maximum amount of honey that can be stored
#Plan: 
    #Two-pointer. 
    # While the left is less than the right:
    # Check wether the left and right elements can contain the most amount of honey and stores
        # it in a variable(maximum)
    # return the maximum variable

#Implement:

def most_honey(height):
    left,right = 0, len(height) - 1
    maximum = 0

    while left < right:
        maximum = max(maximum, min(height[left], height[right]) * (right - left))

        if height[left] < height[right]:
            left += 1
        else: 
            right -= 1
        
    print(maximum)

height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
most_honey(height)

height = [1, 1]
most_honey(height)
