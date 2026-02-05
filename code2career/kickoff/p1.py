class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

def print_list(head):
    if not head:
        return head

    current = head
    while current:
        print(current.value)
        current = current.next

def alternate_order(head):
    if not head:
        return head

    current = head

    while current.next is not None:

        p = head
        while p.next is not None:
            p = p.next


        tail = p

        temp = current.next
        current.next = tail
        tail.next = temp
        current = temp

    

list = Node(1, Node(2, Node(3, Node(4, Node(5)))))

alternate_order(list)



