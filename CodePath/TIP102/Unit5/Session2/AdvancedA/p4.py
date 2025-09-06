#Understand:
    #Input - head of a linked list
    #output - Return true if list has cycle, false otherwise
#Match:
    #slow-fast pointer
#Plan:
#Implement:
class Node:
    def __init__(self, value, next=None):
        self.value = value 
        self.next = next

def has_cycle(head):
    if not head:
        return False
    
    slow = head
    fast = head
    
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow==fast:
            return True
        
    return False

#Evaluate:
    #Space complexity - O(n)
    #Time complexity - O(1)

peach = Node("Peach", Node("Luigi", Node("Mario", Node("Toad"))))

# Toad.next = Luigi
peach.next.next.next = peach.next

print(has_cycle(peach))