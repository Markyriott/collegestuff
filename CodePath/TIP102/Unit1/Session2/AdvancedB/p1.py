#Understand:
    #Input - two n x m matrices( matrix1 and matrix2)
    #Output - an n x m matrix (sum_matrix) that is the sum of the values of the corresponding 
        #elements in the input matrices
#Plan: 
    #instantiate sum_matrix to size n x m
    #iterate through one matrix:
        #iterate through each sub list:
            #sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j]
    #return sum_matrix
#Implement:

def add_matrices(matrix1, matrix2):
    sum_matrix = [[0] * len(matrix1[0]) for _ in matrix1]
    
    for i in range(len(matrix1)):
        for j in range(len(matrix2)):
            sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j]
            
    return sum_matrix

matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

add_matrices(matrix1, matrix2)
