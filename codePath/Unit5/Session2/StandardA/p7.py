#Understand:
    #Input - head of linked list(head), string value(item)
    #Output - modified list with first node that has value of item removed
#Match:
# Traverse linked list
#Plan:
    #current = head
    #while current:
        #if current.next.value = item:
            #current.next = current.next.next
            #return head
    #return head
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

def delete_item(head, item):
    if head is None:
        return head
    
    if head.value == item:
        return head.next
    
    current = head
    while current:
        if current.next and current.next.value == item:
            current.next = current.next.next
            return head
        current = current.next
    return head

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

slingshot = Node("Slingshot")
peaches = Node("Peaches")
beetle = Node("Scarab Beetle")
slingshot.next = peaches
peaches.next = beetle

# Linked List: slingshot -> peaches -> beetle
print_linked_list(delete_item(slingshot, "Peaches"))

# Linked List: slingshot -> beetle
print_linked_list(delete_item(slingshot, "Triceratops Torso"))
