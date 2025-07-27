class TreeNode:
    def __init__(self, value, left=None, right=None):
        self.val = value
        self.left = left
        self.right = right

def harvest_berries(root, threshold):
    if not root:
        return 0

    left = harvest_berries(root.left, threshold)
    right = harvest_berries(root.right,threshold)

    return left + right + (root.val if root.val > threshold else 0)


bush = TreeNode(4, TreeNode(10, TreeNode(5), TreeNode(8)), TreeNode(6, None, TreeNode(20)))

print(harvest_berries(bush, 6))
print(harvest_berries(bush, 30))
