#Understand:
    #Input - Head node of a linkedlist(head), and string(task)
    #Output - Insert new node in front of head 
#Match: 
    #
#Plan:
    #new node = Node(task)
    #new node.next = head
#Implement:
class Node: 
    def __init__(self, value, next=None):
        self.value = value 
        self.next = next

def print_linked_list(head):
    current =  head
    while current:
        print(current.value, end = " -> " if current.next else "\n")
        current = current.next

def add_first(head,task):
    new_head = Node(task, head)
    return new_head


#Evaluate:
    #Time Complexity - O(1) for the insertion
    #Space Complextiy - O(1)


task_1 = Node("shake tree")
task_2 = Node("dig fossils")
task_3 = Node("catch bugs")
task_1.next = task_2
task_2.next = task_3

# Linked List: shake tree -> dig fossils -> catch bugs
print_linked_list(add_first(task_1, "check turnip prices"))
