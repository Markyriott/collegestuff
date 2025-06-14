def is_balanced(code):
    #return len(code) - len(set(code)) 
    print(len(code), len(set(code)), len(code) - len(set(code)))

code1 = "arghh"
code2 = "haha"
code3 = "hhhaaaeeert"

print(is_balanced(code1)) 
print(is_balanced(code2)) 
print(is_balanced(code3)) 