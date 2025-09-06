def can_attend(tour_dates,available):
	return bin_search(tour_dates, available, 0, len(tour_dates) - 1)	

def bin_search(arr,target,left,right):
	if left > right:
		return False
	
	mid = (left + right) // 2
	
	if arr[mid] == target:
		return True
	elif arr[mid] > target:
		return bin_search(arr,target,left,mid - 1)
	elif arr[mid] < target:
		return bin_search(arr,target,mid + 1, right)

print(can_attend([1, 3, 7, 10, 12], 12))
print(can_attend([1, 3, 7, 10, 12], 5))

