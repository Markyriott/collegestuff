def reverse_list(lst):
    left, right = 0, len(lst) - 1

    while left < right:
        lst[left], lst[right] = lst[right], lst[left]
        left += 1
        right -= 1
        
    return lst

lst = ["pooh", "christopher robin", "piglet", "roo", "eeyore"]
reverse_list(lst)
