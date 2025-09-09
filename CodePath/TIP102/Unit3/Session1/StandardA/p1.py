def is_valid_post_format(posts):
    stack = []
    for post in posts:
        print(stack, post, posts)
        if post in "({[":
            stack.append(post)
        elif post in ")}]":
            if not stack: return False
            
            if stack[-1] + post in {"()","[]","{}"}:
                stack.pop()
            else: return False
    return not stack

print(is_valid_post_format("()"))
print(is_valid_post_format("()[]{}")) 
print(is_valid_post_format("(]"))