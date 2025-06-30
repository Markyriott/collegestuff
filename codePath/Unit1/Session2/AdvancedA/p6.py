#Understand:
    #Input - Array of intervals
    #Expected Output - Array of non overlapping intervals 
#Plan:
    #iterate through the list:
        #check if i[1] is less than or equal to i + 1[0]:
            #if not, create new merged interval and add it to a new list
            #if it is, just add to list
    #return list

def merge_intervals(intervals):
    mergedlist = [intervals[0]]
    
    for i in intervals[1:]:
        if i[0] <= mergedlist[-1][1]:
            mergedlist[-1][1] = max(mergedlist[-1][1], i[1])
        else:
            mergedlist.append(i)

    return mergedlist

intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
merge_intervals(intervals)

intervals = [[1, 4], [4, 5]]
merge_intervals(intervals)
