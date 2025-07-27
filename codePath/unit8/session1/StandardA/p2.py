class TreeNode:
    def __init__(self, value, left=None, right=None):
        self.val = value
        self.left = left
        self.right = right

def calculate_yield(root):
    match root.val:
        case "+":
            return root.left.val + root.right.val
        case "-":
            return root.left.val - root.right.val
        case "*":
            return root.left.val * root.right.val
        case "/":
            return root.left.val / root.right.val
        case _:
            return "No operator"

apple_tree = TreeNode("+", TreeNode(7), TreeNode(5))

print(calculate_yield(apple_tree))
