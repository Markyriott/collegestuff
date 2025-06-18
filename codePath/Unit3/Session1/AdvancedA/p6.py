from collections import deque

def mark_event_timeline(event, timeline):
    queue = deque()
    count = 0

    queue.append(("?" * len(timeline), []))
    
    while count < len(timeline) * 10 and queue:
        t = queue.popleft()
        
        if t[0] == timeline:
            print(count)
            return t[1]

        for i in range(len(timeline)):
            if i + len(event) <= len(timeline) and t[0][i : i + len(event)] != timeline[i : i + len(event)]:
                
                updated_string = t[0][ : i] + event + t[0][i + len(event) : ]
                updated_indices = t[1] + [i]

                update = (updated_string, updated_indices)

                queue.append(update)
        count += 1

    return []
    

print(mark_event_timeline("abc", "ababc"))  
print(mark_event_timeline("abca", "aabcaca")) 