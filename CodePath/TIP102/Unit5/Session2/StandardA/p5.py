#Understand:
    #Input - head of a linked list(head)
    #Output - modified list with last node removed
#Match:
    #iterate
#Plan:
    #current
    #while current:
        #if current.next.next == None:
            #current.next = None
            #return head
        #current = current.next

#Implement:
class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

def print_linked_list(head):
    current = head
    while current:
        print(current.value, end = " -> " if current.next else "\n")
        current = current.next

def delete_tail(head):
    if not head or not head.next:
        return None
    
    current = head
    while current:
        if not current.next.next:
            current.next = None
        current = current.next
    return head

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)


butterfly = Node("Common Butterfly")
ladybug = Node("Ladybug")
beetle = Node("Scarab Beetle")
butterfly.next = ladybug
ladybug.next = beetle

# Input List: butterfly -> ladybug -> beetle
print_linked_list(delete_tail(butterfly))
