#Understand: 
    #Input - A couple of nodes
    #Output - connected linked list
#Match:
    #Create nodes and link them together

#Plan:
    #kk_slider.next = harriet
    #harriet.next = saharah
    #sahara.next = isabelle
#Implement:
class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

# For testing
def print_linked_list(head):
    current = head
    while current:
        print(current.value, end=" -> " if current.next else "\n")
        current = current.next

kk_slider = Node("K.K. Slider")
harriet = Node("Harriet")
saharah = Node("Saharah")
isabelle = Node("Isabelle")

kk_slider.next = harriet
harriet.next = saharah
saharah.next = isabelle

print_linked_list(kk_slider)

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)