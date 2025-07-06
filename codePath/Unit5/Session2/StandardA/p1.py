#Understand:
    #Input - a villager instance (new_contact) 
    #Output - returns a list with the name of all friends the current villager and new_contact have in common
#Match:
#Plan:
    #

#Implement:
class Villager:
    def __init__(self, name, species, catchphrase):
        self.name = name
        self.species = species
        self.catchphrase = catchphrase
        self.friends = []
    
    def get_mutuals(self, new_contact):
        mutuals = set(self.friends).intersection(set(new_contact.friends))
        return [friend.name for friend in mutuals]


#Evaluate:
    #Time complexity - O(n + m) - n = self.friends list, m = new_contact.friends list
    #Space complexity - O(n + m + k) = (n and m are the two sets created and k is the mutuals)

bob = Villager("Bob", "Cat", "pthhhpth")
marshal = Villager("Marshal", "Squirrel", "sulky")
ankha = Villager("Ankha", "Cat", "me meow")
fauna = Villager("Fauna", "Deer", "dearie")
raymond = Villager("Raymond", "Cat", "crisp")
stitches = Villager("Stitches", "Cub", "stuffin")

bob.friends = [stitches, raymond, fauna]
marshal.friends = [raymond, ankha, fauna]
print(bob.get_mutuals(marshal))

ankha.friends = [marshal]
print(bob.get_mutuals(ankha))
