#Understand:
    #Input - head node of a linked list(head)
    #Output - modified list with the values divided by 2
#Match: 
    #Iterate 
#Plan:
    #while current:
        #current.value = current.value / 2
    #current = current.next
    #return head 

#Implement:
class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next
    
def print_linked_list(head):
    current = head
    while current:
        print(current.value, end=" -> " if current.next else "\n")
        current = current.next
    
def halve_list(head):
    current = head
    while current:
        current.value = current.value / 2
        current = current.next
    return head

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

node_one = Node(5)
node_two = Node(6)
node_three = Node(7)
node_one.next = node_two
node_two.next = node_three

# Input List: 5 -> 6 -> 7
print_linked_list(halve_list(node_one))
