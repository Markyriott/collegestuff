def edit_post(post):
    def reverse_queued_word(queue):
        word = ""
        while queue:
            word = queue.pop(0) + word
        return word
    
    queue = []
    reverse = ""

    for char in post:
        if char == " ":
            reverse += reverse_queued_word(queue) + " "
        else: queue.append(char)
    reverse += reverse_queued_word(queue)
    return reverse



print(edit_post("Boost your engagement with these tips")) 
print(edit_post("Check out my latest vlog")) 