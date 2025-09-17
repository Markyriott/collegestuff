def find_balanced_subsequence(art_pieces):
    freq = {}

    for piece in art_pieces:
        freq[piece] = freq.get(piece, 0) + 1
    
    max_length = 0

    for k in freq:
        if k + 1 in freq:
            max_length = max(max_length, freq[k] + freq[k + 1])
    
    return max_length

art_pieces1 = [1,3,2,2,5,2,3,7]
art_pieces2 = [1,2,3,4]
art_pieces3 = [1,1,1,1]

print(find_balanced_subsequence(art_pieces1))
print(find_balanced_subsequence(art_pieces2))
print(find_balanced_subsequence(art_pieces3))

