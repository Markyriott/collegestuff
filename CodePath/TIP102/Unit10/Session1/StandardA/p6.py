from collections import deque

def get_all_destinations(flights, start):
    visited = set([start])

    res = []
    queue = deque([start])

    while queue:
        curr = queue.popleft()
        res.append(curr)

        for v in flights.get(curr, []):
            if v not in visited:
                visited.add(v)
                queue.append(v)
    
    return res



flights = {
    "Tokyo": ["Sydney"],
    "Sydney": ["Tokyo", "Beijing"],
    "Beijing": ["Mexico City", "Helsinki"],
    "Helsinki": ["Cairo", "New York"],
    "Cairo": ["Helsinki", "Reykjavik"],
    "Reykjavik": ["Cairo", "New York"],
    "Mexico City": ["Sydney"],
    "New York": []   
}

print(get_all_destinations(flights, "Beijing"))
print(get_all_destinations(flights, "Helsinki"))
