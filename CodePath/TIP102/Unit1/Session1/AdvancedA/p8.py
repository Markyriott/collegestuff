def local_maximums(grid):
    ret = []

    for i in range(len(grid) - 2):
        row = []
        for j in range(len(grid[i]) - 2):
            largest = max(
                grid[i][j], grid[i][j + 1], grid[i][j+2],
                grid[i+1][j], grid[i+1][j+1], grid[i+1][j+2],
                grid[i + 2][j], grid[i + 2][j + 1], grid[i + 2][j + 2]
                )
            row.append(largest)
        ret.append(row)

    print(ret)
    return ret
    

grid = [
	[9, 9, 8, 1],
	[5, 6, 2, 6],
	[8, 2, 6, 4],
	[6, 2, 2, 2]
]
local_maximums(grid)

grid = [
	[1, 1, 1, 1, 1],
	[1, 1, 1, 1, 1],
	[1, 1, 2, 1, 1],
	[1, 1, 1, 1, 1],
	[1, 1, 1, 1, 1]
]
local_maximums(grid)
