#Understand:
    #Input - head of linked list
    #Output - modified list with the tail inserted in front of head
#Match: Linked list traversal
#Plan: 
    #current = head
    #new head = None
    #while current:
        #if current.next and current.next.next == None:
            #new head = current.next
            #current.next.next = head
            #current.next = None
    #return new head
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

def tail_to_head(head):
    if head == None or head.next == None:
        return head
    
    current = head
    new_head = None
    while current:
        if current.next and current.next.next == None:
            new_head = current.next
            current.next.next = head
            current.next = None
        current = current.next
    return new_head    
#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

daisy = Node("Daisy")
mario = Node("Mario")
toad = Node("Toad") 
peach = Node("Peach")
daisy.next = mario
mario.next = toad
toad.next = peach

# Linked List: Daisy -> Mario -> Toad -> Peach
print_linked_list(tail_to_head(daisy))
