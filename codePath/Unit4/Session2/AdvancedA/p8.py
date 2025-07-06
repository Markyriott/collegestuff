#Understand:
    #Input - list of dictionaries
    #Output - Boolean depending on scene order
#Match: iterate
#Plan:
    #for i in range(len(scenes)):
        #if not scenes[i + 1] = scenes[i] + 1:
            #return False
    #return True
#Implement:
def analyze_storyline_continuity(scenes):
    for i in range(len(scenes) - 1):
        if scenes[i+1]['timestamp'] != scenes[i]['timestamp'] + 1:
            return False
    return True
#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

scenes = [
    {"scene": "The hero enters the dark forest.", "timestamp": 1},
    {"scene": "A mysterious figure appears.", "timestamp": 2},
    {"scene": "The hero faces his fears.", "timestamp": 3},
    {"scene": "The hero finds a hidden treasure.", "timestamp": 4},
    {"scene": "An eerie silence fills the air.", "timestamp": 5}
]

continuity = analyze_storyline_continuity(scenes)
print(continuity)

scenes = [
    {"scene": "The spaceship lands on an alien planet.", "timestamp": 3},
    {"scene": "A strange creature approaches.", "timestamp": 2},
    {"scene": "The crew explores the new world.", "timestamp": 4},
    {"scene": "The crew encounters hostile forces.", "timestamp": 5},
    {"scene": "The crew makes a narrow escape.", "timestamp": 6}
]

continuity = analyze_storyline_continuity(scenes)
print(continuity)
