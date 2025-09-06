def my_sqrt(x):
	return bin_search(x,0, x)
	
def bin_search(target,left,right):
	if left >=right:
		return right

	mid = (left + right) //2
	if mid ** 2 == target:
		return mid
	elif mid ** 2 < target:
		return bin_search(target, mid + 1, right)
	elif mid ** 2 > target:
		return bin_search(target, left, mid - 1)	

print(my_sqrt(4))
print(my_sqrt(8))

