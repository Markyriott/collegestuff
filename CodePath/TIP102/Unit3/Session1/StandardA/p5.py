def clean_post(post):
    stack = []

    for char in post:
        if stack and stack[-1] != char and stack[-1].lower() == char.lower():
            stack.pop()
        else: stack.append(char)
    return "".join(stack)

print(clean_post("poOost")) 
print(clean_post("abBAcC")) 
print(clean_post("s")) 