def harvest(vegetable_patch):
    count = 0

    for i in vegetable_patch:
        for j in range(len(i)):
            if i[j] == 'c':
                count += 1
    print(count)
    return count
vegetable_patch = [
	['x', 'c', 'x'],
	['x', 'x', 'x'],
	['x', 'c', 'c'],
	['c', 'c', 'c']
]
harvest(vegetable_patch)
