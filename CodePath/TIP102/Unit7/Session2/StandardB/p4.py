def get_group_sum(group_sizes, room_capacity):
	sorted_arr = sorted(group_sizes)
	max_sum = -1
	for i,v in enumerate(sorted_arr):
		max_sum = max(max_sum, bin_sum_search(i,sorted_arr,i+1,len(sorted_arr)-1,room_capacity,-1))
	return max_sum

def bin_sum_search(i,arr,left,right,target,curr_max):
	if left > right:
		return curr_max

	mid = (left + right) // 2	

	if arr[i] + arr[mid] < target:
		return bin_sum_search(i,arr,mid+1,right,target,max(curr_max,arr[i]+arr[mid]))
	else:
		return bin_sum_search(i,arr,left,mid -1, target, curr_max)
		
print(get_group_sum([1,20,10,14,3,5,4,2], 12))
print(get_group_sum([10,20,30], 15))

