#Understand: 
    #Input - Dictionary where keys are scene names and values are lists of strings of keywords
    #Output - list of keywords that appear most frequently across all scenes

#Match: Dictionary freq map

#Plan: 
    #initialize freq dictionary
    #for Scene in scenes:
        #for keyword in scene[1]:
            #freq[keyword] = freq.get(keyword, 0) + 1
    #return [max(freq, key = freq.get())]

#Implement:
def find_most_frequent_keywords(scenes):
    freq = {}
    for scene in scenes.values():
        for keyword in scene:
            freq[keyword] = freq.get(keyword, 0) + 1
    maximum = max(freq.values())
    return [key for key,value in freq.items() if value == maximum]

#Evaluate: 
    #Time Complexity - O(n*m*k)
    #Space Complexity - O(n)
    
scenes = {
    "Scene 1": ["action", "hero", "battle"],
    "Scene 2": ["hero", "action", "quest"],
    "Scene 3": ["battle", "strategy", "hero"],
    "Scene 4": ["action", "strategy"]
}
print(find_most_frequent_keywords(scenes))

scenes = {
    "Scene A": ["love", "drama"],
    "Scene B": ["drama", "love"],
    "Scene C": ["comedy", "love"],
    "Scene D": ["comedy", "drama"]
}
print(find_most_frequent_keywords(scenes)) 