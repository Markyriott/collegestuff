#Understand:
    #Input - string ( s ). Can contain leading or trailing spaces
    #Output - new string where consecutive spaces are reduced to a single space
    #Constraint - can't use any built-in trim methods
#Plan: 
    #initialize new_string var
    #Iterate for c in s:
        #if c != ' ':
            #new_string.append(c)
        #elif  c == ' ' and new_string and new_string[-1]!= ' ':
            #new_string.append(c)

def squash_spaces(s):
    new_string = ''

    for c in s:
        if c != ' ':
            new_string += c
        elif c == ' ' and len(new_string) > 0 and new_string[-1] != ' ': 
            new_string += c
    if new_string and new_string[-1] == ' ':
        new_string = new_string[:-1]
        
    return new_string
s = "   Up,     up,   and  away! "
squash_spaces(s)

s = "With great power comes great responsibility."
squash_spaces(s)
