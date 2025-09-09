def is_symmetrical_title(title):
    left,right = 0, len(title) - 1
    
    while left < right:
        while left < right and not title[left].isalpha():
            left += 1

        while left < right and not title[right].isalpha():
            right -= 1
        
        if title[left].lower() != title[right].lower():
            return False
        
        left += 1
        right -= 1
        
    return True

print(is_symmetrical_title("A Santa at NASA"))
print(is_symmetrical_title("Social Media")) 