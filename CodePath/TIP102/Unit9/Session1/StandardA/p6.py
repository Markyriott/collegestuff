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

def zigzag_icing_order(cupcakes):
    if not cupcakes:
        return None
    
    res = []
    queue = deque([cupcakes])
    toggle = True

    while queue:
        level_size = len(queue) # Gets width of the current tree level
        level = deque() # Creates new queue to hold the values in this level
        for _ in range(level_size): # iterates through each node in the level
            node = queue.popleft()

            # If toggle is true, append normally so that the value of each node is added to the level list from left to right
            # If toggle is false, appendleft so that the value of each node is added to the level list from right to left
            if toggle: 
                level.append(node.val)
            else:
                level.appendleft(node.val)
            
            #Adds the next level to the queue
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        #Adds the level list to the res list
        res.extend(level)
        #flips toggle
        toggle = not toggle

    return res

flavors = ["Chocolate", "Vanilla", "Lemon", "Strawberry", None, "Hazelnut", "Red Velvet"]
cupcakes = build_tree(flavors)
print(zigzag_icing_order(cupcakes))