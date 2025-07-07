#Understand:
    #Input - head of a sorted linked list
    #Output - modified list with duplicates removed
#Match:
    #Traverse linked list
    #Temp Head technique
#Plan:
    #temphead
    #temphead.next = head
    #seen = set()
    #current = head
    #prev = temphead
    #while current:
        #if current.value == current.next.value or current.value in seen:
            #prev.next = current.next
        #else:
            #prev = current
        #current = current.next
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

def delete_dupes(head):
    temphead = Node("temp")
    temphead.next = head
    
    seen = set()
    current = head
    prev = temphead
    while current:
        if current.next and current.value == current.next.value or current.value in seen:
            prev.next = current.next
            seen.add(current.value)
        else:
            prev = current
        current = current.next
    return temphead
            

#Evaluate:
    #Time complexity - O(n)
    #Space complexity - O(n)

head = Node(1, Node(2, Node(3, Node(3, Node(4, Node(5))))))

# Linked List: 1 -> 2 -> 3 -> 3 -> 4 -> 5
print_linked_list(delete_dupes(head))


#Better solution with O(1) space complexity:
# def delete_dupes(head):
#     temp= Node("temp")
#     temp.next = head

#     current = head
#     prev = temp
#     while current:
#         # Move current to skip over all duplicates
#         while current.next and current.value == current.next.value:
#             current = current.next

#         # If `prev.next` is `current`, no duplicates were found between `prev` and `current`
#         if prev.next == current:
#             prev = prev.next
#         else:
#             # Otherwise, skip all duplicates
#             prev.next = current.next

#         # Move current to the next distinct value
#         current = current.next

#     return temp.next