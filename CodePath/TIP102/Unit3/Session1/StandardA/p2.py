def reverse_comments_queue(comments):
    stack = []
    for comment in comments:
        stack.append(comment)
    return [stack.pop() for _ in range(len(stack))]
    
    

print(reverse_comments_queue(["Great post!", "Love it!", "Thanks for sharing."]))

print(reverse_comments_queue(["First!", "Interesting read.", "Well written."]))