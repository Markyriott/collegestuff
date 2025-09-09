from collections import deque
#Understasnd:
    #Input - list of strings(scenes)
    #Output - print each transition from the current scene to the next

#Match: HAve to use a queue to process each string in the list
 
#Plan:
    #Initialize deque
    #for i in range(len(scenes) - 1):
        #queue.append(f"Transition from {scenes[i]} to {scenes[i+1]}}")
    #while queue:
        #print(queue.pop())

#Implement:
def track_scene_transitions(scenes):
    queue = deque()

    for i in range(len(scenes) - 1):
        queue.append(f"Transition from {scenes[i]} to {scenes[i + 1]}")
    while queue:
        print(queue.popleft())

#Evaluate:
    #Time Complexity - O(n)
    #Space Complexity - O(n)

scenes = ["Opening", "Rising Action", "Climax", "Falling Action", "Resolution"]
track_scene_transitions(scenes)

scenes = ["Introduction", "Conflict", "Climax", "Denouement"]
track_scene_transitions(scenes)