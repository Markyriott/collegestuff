#Understand: 
    #Input - List of dictionaries
    #Output - Return list of themes that appear more than once
#Match: Frequency Map
#Plan:
    #Initialize dictionary

    #for scene in scenes:
        #dictionary[scene.get('theme') = dictionary.get(scene.get('theme), 0) + 1
    #return [key for key,value in dictionary.items() if value > 1]
#Implement:
def identify_repeated_themes(scenes):
    freq = {}

    for scene in scenes:
        freq[scene['theme']] = freq.get(scene['theme'], 0) + 1
    
    return [key for key,value in freq.items() if value > 1]

#Evaluate:
    #Time Complexity - O(n)
    #Space Complexity - O(n)

scenes = [
    {"scene": "The hero enters the dark forest.", "theme": "courage"},
    {"scene": "A mysterious figure appears.", "theme": "mystery"},
    {"scene": "The hero faces his fears.", "theme": "courage"},
    {"scene": "An eerie silence fills the air.", "theme": "mystery"},
    {"scene": "The hero finds a hidden treasure.", "theme": "discovery"}
]

repeated_themes = identify_repeated_themes(scenes)
print(repeated_themes)

scenes = [
    {"scene": "The spaceship lands on an alien planet.", "theme": "exploration"},
    {"scene": "A strange creature approaches.", "theme": "danger"},
    {"scene": "The crew explores the new world.", "theme": "exploration"},
    {"scene": "The crew encounters hostile forces.", "theme": "conflict"},
    {"scene": "The crew makes a narrow escape.", "theme": "danger"}
]

repeated_themes = identify_repeated_themes(scenes)
print(repeated_themes)
