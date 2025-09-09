def find_perfect_song(playlist, length):
	return bin_search(playlist,length, 0, len(playlist) - 1)	
	
def bin_search(arr,target,left,right):
	if left > right:
		return -1

	mid = (left + right) // 2
	if arr[mid] == target:
		return mid
	elif arr[mid] > target:
		return bin_search(arr,target,left, mid)
	elif arr[mid] < target:
		return bin_search(arr,target,mid + 1, right)
	

print(find_perfect_song([101, 102, 103, 104, 105], 103))
print(find_perfect_song([201, 202, 203, 204, 205], 206))

