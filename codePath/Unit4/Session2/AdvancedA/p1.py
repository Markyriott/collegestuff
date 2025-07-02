#Understand: 
    #Input - Dictionary where the keys are character names and the values are lists of strings of their dialogue lines
    #Output - Integer representing the amount of unique characters in the script

#Match: set type cast

#Plan: 
    #return len(set(script.keys()))

#Implement:
def count_unique_characters(script):
    return len(set(script.keys()))

#Evaluate: 
    #Time Complexity - O(n)
    #Space Complexity - O(n)

script = {
    "Alice": ["Hello there!", "How are you?"],
    "Bob": ["Hi Alice!", "I'm good, thanks!"],
    "Charlie": ["What's up?"]
}
print(count_unique_characters(script)) 

script_with_redundant_keys = {
    "Alice": ["Hello there!"],
    "Alice": ["How are you?"],
    "Bob": ["Hi Alice!"]
}
print(count_unique_characters(script_with_redundant_keys)) 