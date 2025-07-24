def find_cruise_length(cruise_lengths, vacation_length):
    left, right = 0, len(cruise_lengths) - 1

    while left < right:
        midpoint = (right + left) // 2
        print(left, cruise_lengths[left],right, cruise_lengths[right], midpoint)
        if cruise_lengths[midpoint] == vacation_length:
            return True
        if cruise_lengths[midpoint] < vacation_length:
            left = midpoint + 1
        elif cruise_lengths[midpoint] > vacation_length:
            right = midpoint

    return False

print(find_cruise_length([9, 10, 11, 12, 13, 14, 15], 13))

print(find_cruise_length([8, 9, 12, 13, 13, 14, 15], 11))
