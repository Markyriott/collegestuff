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

def rotate_right(head, k):
    if not head or not head.next or k == 0:
        return head
    
    fast = slow = head

    i = 0

    while i < k:
        i += 1
        if not fast.next:
            fast = head
        else:
            fast = fast.next

    while fast.next:
        slow = slow.next
        fast = fast.next
    
    new_head = slow.next
    slow.next = None
    fast.next = head

    return new_head


evidence_list1 = Node(1, Node(2, Node(3, Node(4, Node(5)))))
evidence_list2 = Node(0, Node(1, Node(2)))

print_linked_list(rotate_right(evidence_list1, 2))
print_linked_list(rotate_right(evidence_list2, 4))
