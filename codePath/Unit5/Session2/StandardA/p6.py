#Understand:
    #Input - head of a linkedlist(head)
    #Output - return minimum value in the linkedlist
#Match: 
    # - Iterate through list
    # - use min() function
#Plan:
    #current = head
    #minimum = float('inf')
    #while current:
        #minimum = min(minimum, current.value)
        #current = current.next
    #return minimum

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

def find_min(head):
    minimum = head.value
    current = head.next
    while current:
        minimum = min(minimum, current.value)
        current = current.next
    return minimum

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

head1 = Node(5, Node(6, Node(7, Node(8))))
head2 = Node(8, Node(5, Node(6, Node(7))))

# Linked List: 5 -> 6 -> 7 -> 8
print(find_min(head1))

# Linked List: 8 -> 5 -> 6 -> 7
print(find_min(head2))
