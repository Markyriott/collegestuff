
def m1atchsticks():
    total_code = 0
    total_string = 0

    for line in open('p8.txt'):
        print(line)

        total_code += len(line)
        
        i = 1
        while i < len(line) - 1:
            if line[i] == '\\':
                if line[i + 1] == 'x':
                    i += 4
                else: i += 2
            else:
                i += 1
            total_string += 1

    print(total_code - total_string)

def matchsticks():
    total_code = 0
    total_encoded = 0

    for line in open('p8.txt'):
        print(line)

        total_code += len(line)

        new_string = '"'
        for c in line:
            if c == '\\':
                new_string += '\\\\'
            elif c == '"':
                new_string += '\\\"'
            else: new_string += c
        new_string += '"'
        total_encoded += len(new_string)


    print(total_encoded - total_code)



matchsticks()

