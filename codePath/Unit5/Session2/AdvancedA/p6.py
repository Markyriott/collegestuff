#Understand:
    #Input - head of a singly linked list and an integer(k) 
    #Output - modified list where the first k elements are reversed 
#Match:
    #traverse
#Plan:
    #if not head or k<= 1: 
        #return head

    #current = head
    #prev = none
    #next_node = none
    #count = 0

    #while current and count < k:
        #next_node = current.next
        #current.next = prev
        #prev = current
        #current = next_node
        #count += 1

    #if head:
        #head.next = current
    #return prev 

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
        
def reverse_first_k(head, k):
    if not head or k <= 1:
	    return head
	
    current = head
    prev = None
    next_node = None
    count = 0

    while current and count < k:
          next_node = current.next # stores the node after current in next_node
          current.next = prev # changes the next value of the current node to what's in prev var
          prev = current # change the prev var to the current node
          current = next_node # change current to the node stored in next_node
          count += 1 

    if head:
          head.next = current # connects the head--which is now the last node--back to the rest of the list
    return prev

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(1)

head = Node("apple", Node("cherry", Node("orange", Node("peach", Node("pear")))))

print_linked_list(reverse_first_k(head, 3))
