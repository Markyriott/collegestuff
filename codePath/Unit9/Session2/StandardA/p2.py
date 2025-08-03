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


def sum_each_days_orders(orders):
    if not orders:
        return None

    res = []
    queue = deque([orders])

    while queue:
        sum = 0
        for i in range(len(queue)):
            node = queue.popleft()
            sum += node.val
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        res.append(sum)
    return res

order_sizes = [4, 2, 6, 1, 3]
orders = build_tree(order_sizes)

print(sum_each_days_orders(orders))
