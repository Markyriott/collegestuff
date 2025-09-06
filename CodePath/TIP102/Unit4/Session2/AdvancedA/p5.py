#Understand:
    #Input - list of strings (scenes) and a string(keyword)
    #Output - filtered list that filtered all scenes that contains the keyword
#Match: string 
#Plan:
    #return_list = []
    #for scene in scenes:
        #if keyword not in scene:
            #return_list.append(scene)
    #return return_list

#Implement:
def filter_scenes_by_keyword(scenes,keyword):
    filtered = []
    for scene in scenes:
        if keyword not in scene:
            filtered.append(scene)
    return filtered


#Evaluate:
    #Time Complexity - O(n)
    #Space Complexity - O(n)

scenes = [
    "The hero enters the dark forest.",
    "A mysterious figure appears.",
    "The hero finds a hidden treasure.",
    "An eerie silence fills the air."
]
keyword = "hero"

filtered_scenes = filter_scenes_by_keyword(scenes, keyword)
print(filtered_scenes)

scenes = [
    "The spaceship lands on an alien planet.",
    "A strange creature approaches the crew.",
    "The crew prepares to explore the new world."
]
keyword = "crew"

filtered_scenes = filter_scenes_by_keyword(scenes, keyword)
print(filtered_scenes)
