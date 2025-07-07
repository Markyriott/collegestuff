#Understand:
    #Input - head of linked list and integer (n)
    #Output - return head of modified list where the nth node is removed from the end of the list
#Match: 
    #Traverse linked list
    #Temphead
    #two pointer
#Plan:

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

def remove_nth_from_end(head, n):
    temp = Node('temp', head)

    first,second = temp, temp
    
    #Advanved first pointer so the gap between pointers i n nodes 
    for i in range(n+1):
        first = first.next

    #advance both pointers while keeping the same gap of n nodes
    while first is not None: #when the first pointer passes the end, you know the second pointer is n nodes from the end
        first = first.next
        second = second.next

    second.next = second.next.next

    return temp.next

#Evaluate:
    #time complexity - O(n)
    #space complexity - O(1)

head1 = Node("apple", Node("cherry", Node("orange", Node("peach", Node("pear")))))
head2 = Node("Rainbow Trout", Node("Ray"))
head3 = Node("Rainbow Stag")


print_linked_list(remove_nth_from_end(head1, 2))
print_linked_list(remove_nth_from_end(head2, 1))
print_linked_list(remove_nth_from_end(head3, 1))
