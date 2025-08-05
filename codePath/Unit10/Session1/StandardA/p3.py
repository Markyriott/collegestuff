def get_direct_flights(flights, source):
    if not flights or not flights[source]:
        return []
    
    res = []

    for i, v in enumerate(flights[source]):
        if v == 1:
            res.append(i)

    return res

flights = [
            [0, 1, 1, 0],
            [1, 0, 0, 0],
            [1, 1, 0, 1],
            [0, 0, 0, 0]]

print(get_direct_flights(flights, 2))
print(get_direct_flights(flights, 3))
