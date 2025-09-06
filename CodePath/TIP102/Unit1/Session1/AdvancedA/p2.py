def final_value_after_operations(operation):
    tigger = 1

    for op in operation:
        if op in ("bouncy", "flouncy"):
            tigger += 1
        elif op in ("trouncy", "pouncy"):
            tigger -=1
    return tigger

operations = ["trouncy", "flouncy", "flouncy"]
final_value_after_operations(operations)

operations = ["bouncy", "bouncy", "flouncy"]
final_value_after_operations(operations)
