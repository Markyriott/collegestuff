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

def add_two_numbers(head_a, head_b):
    temphead = Node(0)
    sumlist = temphead

    p1 = head_a
    p2 = head_b
    carry = 0

    while p1 or p2 or carry:
        s = carry
        if p1:
            s += p1.value
            p1 = p1.next
        if p2:
            s += p2.value
            p2 = p2.next
        
        carry = s // 10
        sumlist.next = Node(s % 10)
        sumlist = sumlist.next

    return temphead.next

head_a = Node(2, Node(4, Node(3))) # 342
head_b = Node(5, Node(6, Node(4))) # 465

print_linked_list(add_two_numbers(head_a, head_b))
