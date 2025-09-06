#Undertsand:
    #Input - tail of a liked list
    #Output - print out the values of the list in reverse
#Match: Traverse linked list
#Plan:
    #current = tail
    #while current:
        #print(current.prev.value, " <-> ", current.value)
        #current = current.prev
#Implement:
class Node:
    def __init__(self, value, next=None, prev=None):
        self.value = value
        self.next = next
        self.prev = prev

def print_reverse(tail):
    current = tail
    while current:
        print((current.prev.value, " <-> ", current.value) if current.prev else "\n")
        current = current.prev

#Evaluate: 
    #Time complexity - O(n)
    #Space complexity - O(1)

isabelle = Node("Isabelle")
kk_slider = Node("K.K. Slider")
saharah = Node("Saharah")
isabelle.next = kk_slider
kk_slider.next = saharah
saharah.prev = kk_slider
kk_slider.prev = isabelle

# Linked List: Isabelle <-> K.K. Slider <-> Saharah
print_reverse(saharah)
