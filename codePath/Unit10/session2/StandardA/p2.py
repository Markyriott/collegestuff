def can_rebook(flights, source, dest):

    def recurse_help(current_i):
        if current_i == dest:
            return True

        for i in range(len(flights[current_i])):
            if flights[current_i][i] == 1:
                return recurse_help(i)
        return False

    return recurse_help(source)

flights1 = [
    [0, 1, 0], # Flight 0
    [0, 0, 1], # Flight 1
    [0, 0, 0]  # Flight 2
]

flights2 = [
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [0, 0, 0, 0, 1],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0]
]

print(can_rebook(flights1, 0, 2))
print(can_rebook(flights2, 0, 2)) 
