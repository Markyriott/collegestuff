def merged_tracks(track1, track2):
    merged_track = []
    i=j=0

    while i < len(track1) and j < len(track2):
        if track1[i] < track2[j]:
            merged_track.append(track1[i])
            i+=1
        else:
            merged_track.append(track2[j])
            j+=1

    while i < len(track1):
        merged_track.append(track1[i])
        i+=1

    while j < len(track2):
        merged_track.append(track2[j])
        j+=1
    return merged_track


track1 = [1, 3, 5]
track2 = [2, 4, 6]
track3 = [10, 20]
track4 = [15, 30]

print(merged_tracks(track1, track2))
print(merged_tracks(track3, track4))

