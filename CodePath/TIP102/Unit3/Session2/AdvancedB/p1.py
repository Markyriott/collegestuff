#Not done


def score_of_mystical_market_chains(chain):
    stack = []
    count = 0

    for i in chain:
        if stack and stack[-1] == "(":
            stack.pop()
            count += 1
        else: stack.append(i)
    
    return count
    



print(score_of_mystical_market_chains("()"))  
print(score_of_mystical_market_chains("(())"))
print(score_of_mystical_market_chains("()()")) 
