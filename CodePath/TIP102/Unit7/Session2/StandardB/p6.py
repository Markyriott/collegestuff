def merge_sort_helper(left_arr,right_arr):
    merged_list =[]
    i=j=0

    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            merged_list.append(left_arr[i])
            i+=1
        else:
            merged_list.append(right_arr[j])
            j+=1


    while i < len(left_arr):
        merged_list.append(left_arr[i])
        i+=1
    while j < len(right_arr):
        merged_list.append(right_arr[j])
        j+=1

    return merged_list

def merge_sort_playlist(playlist):
    if len(playlist) <=1:
        return playlist

    mid = (len(playlist)) // 2
    
    left = merge_sort_playlist(playlist[:mid])
    right = merge_sort_playlist(playlist[mid:])
    
    return merge_sort_helper(left,right)
     
print(merge_sort_playlist(["Formation", "Crazy in Love", "Halo"]))
print(merge_sort_playlist(["Single Ladies", "Love on Top", "Irreplaceable"]))

