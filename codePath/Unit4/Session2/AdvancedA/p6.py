#Understand:
    #Input - List of string representing a character's development(event)
    #Output - Processed list of the events maintaing the correct sequence
#Match: Stack
#Plan:
    #Stack  = []
    #returnlist = []
    #for event in reversed(events):
        #stack.append(event)

    #while stack:
        #returnlist.append(stack.pop())
    #return returnlist
#Implement:
def manage_character_arc(events):
    stack = []
    returnlist = []
    for event in reversed(events):
        stack.append(event)
    while stack:
        returnlist.append(stack.pop())
    return returnlist

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(n)

events = [
    "Character is introduced.",
    "Character faces a dilemma.",
    "Character makes a decision.",
    "Character grows stronger.",
    "Character achieves goal."
]

processed_arc = manage_character_arc(events)
print(processed_arc)

events = [
    "Character enters a new world.",
    "Character struggles to adapt.",
    "Character finds a mentor.",
    "Character gains new skills.",
    "Character faces a major setback.",
    "Character overcomes the setback."
]

processed_arc = manage_character_arc(events)
print(processed_arc)
