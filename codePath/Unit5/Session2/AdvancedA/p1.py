#Understand:
    #Input - head of a linkedlist
    #Output - MAximum value in the list
#Match:
    #Traverse linked list
    #max() func
#Plan:
    #if not head:
        #return None
    #current = head.next
    #maximum = head
    #while current:
        #maximum = max(maximum, current.value)
        #current = current.next
    #return maximum
#Implement:
class Node:
    def __init__(self,value,next=None):
        self.value = value
        self.next = next
    
def print_linked_list(head):
    current = head
    while current:
        print(current.value, end=" -> " if current.next else "\n")
        current = current.next
def find_max(head):
    if not head:
        return None
    
    current = head.next
    maximum = head.value
    while current:
        maximum = max(maximum, current.value)
        current = current.next
    return maximum

#Evaluate:
    #Time complexity - O(n)
    #space complexity - O(1)


head1 = Node(5, Node(6, Node(7, Node(8))))

# Linked List: 5 -> 6 -> 7 -> 8
print(find_max(head1))

head2 = Node(5, Node(8, Node(6, Node(7))))

# Linked List: 5 -> 8 -> 6 -> 7
print(find_max(head2))
