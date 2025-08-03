from collections import deque 

# Tree Node class
class TreeNode:
  def __init__(self, value, key=None, left=None, right=None):
      self.key = key
      self.val = value
      self.left = left
      self.right = right

def build_tree(values):
  if not values:
      return None

  def get_key_value(item):
      if isinstance(item, tuple):
          return item[0], item[1]
      else:
          return None, item

  key, value = get_key_value(values[0])
  root = TreeNode(value, key)
  queue = deque([root])
  index = 1

  while queue:
      node = queue.popleft()
      if index < len(values) and values[index] is not None:
          left_key, left_value = get_key_value(values[index])
          node.left = TreeNode(left_value, left_key)
          queue.append(node.left)
      index += 1
      if index < len(values) and values[index] is not None:
          right_key, right_value = get_key_value(values[index])
          node.right = TreeNode(right_value, right_key)
          queue.append(node.right)
      index += 1

  return root


def sweet_difference(chocolates):
    if not chocolates:
        return None

    res = []
    queue = deque([chocolates])

    while queue:
        highest = 0
        lowest = float('inf')
        for i in range(len(queue)):
            node = queue.popleft()

            highest = max(node.val,highest)
            lowest = min(node.val,lowest)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        res.append(abs(highest-lowest))
    return res


sweetness_levels1 = [3, 9, 20, None, None, 15, 7]
chocolate_box1 = build_tree(sweetness_levels1)

sweetness_levels2 = [1, 2, 3, 4, 5, None, 6]
chocolate_box2 = build_tree(sweetness_levels2)

print(sweet_difference(chocolate_box1))  
print(sweet_difference(chocolate_box2))
