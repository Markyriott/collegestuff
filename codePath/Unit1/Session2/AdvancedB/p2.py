#Understand:
    # Input - string of only lowercase alphabetic characters
    # Output - Boolean, True if string is palindrome else False
#Plan:
    #Must used two-pointer for this problem
    # while left < right:
        #if left == right:
            #left += 1
            #right -= 1
        #else: 
            #return False
    #return True


def is_palindrome(s):
    left,right = 0, len(s) - 1

    while left < right:
        if s[left] == s[right]:
            left += 1
            right -= 1
        else: 
            return False
    return True

s = "madam"
is_palindrome(s)

s = "madamweb"
is_palindrome(s)
