def is_authentic_collection(art_pieces):
    art_pieces.sort()

    if art_pieces[-1] == len(art_pieces) - 1 and art_pieces[-2] == len(art_pieces) - 1:
        return True
    return False

collection1 = [2, 1, 3]
collection2 = [1, 3, 3, 2]
collection3 = [1, 1]

print(is_authentic_collection(collection1))
print(is_authentic_collection(collection2))
print(is_authentic_collection(collection3))

