#helped

def arrange_attendees_by_priority(attendees, priority):
    l,r,i= 0, len(attendees) - 1, 0

    while i <= r:
        if attendees[i] < priority:
            attendees[i], attendees[l] = attendees[l], attendees[i]
            l += 1
            i += 1
        elif attendees[i] > priority:
            attendees[i], attendees[r] = attendees[r], attendees[i]
            r -= 1
        else: 
            i+= 1
    return attendees

print(arrange_attendees_by_priority([9,12,5,10,14,3,10], 10)) 
print(arrange_attendees_by_priority([-3,4,3,2], 2)) 