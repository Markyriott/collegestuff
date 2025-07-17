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

def partition(suspect_ratings, threshold):
    if not suspect_ratings:
        return suspect_ratings
    
    temp_head = Node('temp')
    temp_tail = temp_head
    prev = suspect_ratings
    current = suspect_ratings.next
    
    while current:
        if current.value > threshold:
            prev.next = current.next
            temp_tail.next = current
            temp_tail = temp_tail.next
            current = prev.next
        else: 
            prev = current
            current = current.next

    temp_tail.next = suspect_ratings
    return temp_head.next

suspect_ratings = Node(1, Node(4, Node(3, Node(2, Node(5, Node(2))))))

print_linked_list(partition(suspect_ratings, 3))
