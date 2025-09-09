def post_compare(draft1, draft2):
    def post_build(draft):
        stack = []
        for c in draft:
            if c == "#":
                if stack:
                    stack.pop()

            else: stack.append(c)
        return stack
    
    return post_build(draft1) == post_build(draft2)
    


print(post_compare("ab#c", "ad#c"))
print(post_compare("ab##", "c#d#")) 
print(post_compare("a#c", "b")) 