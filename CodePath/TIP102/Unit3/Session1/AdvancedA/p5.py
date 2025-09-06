def min_changes_to_make_balanced(schedule):
    stack = []

    for c in schedule:
        if stack and c == ")" and stack[-1] == "(":
            stack.pop()
        else: 
            stack.append(c)
    return len(stack)

print(min_changes_to_make_balanced("())"))
print(min_changes_to_make_balanced("((("))
print(min_changes_to_make_balanced(")(")) 