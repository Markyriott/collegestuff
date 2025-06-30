#Understand: 
    #Input - List of non-overlapping intervals(intervals) and a list containing a new interval to insert(new_interval)
    #Output - The intervals list with the new intervals inserted, merging if it overlaps with another interval
#Plan: 
    #for i in range(intervals):
        #if intervals[i][0] < new_intervals[0] and intervals[i][1] < new_interval[1]:
            #intervals[i] = [intervals[i][0], new_intervals[1]]
            #  
def insert_interval(intervals, new_intervals):
    pass

intervals = [[1, 3], [6, 9]]
new_interval = [2, 5]
insert_interval(intervals, new_interval)

intervals = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]]
new_interval = [4, 8]
insert_interval(intervals, new_interval)
