import hashlib

def stocking_stuffer(input):
    count = 0
    while True:
        res = hashlib.md5((input + str(count)).encode())
        if res.hexdigest()[:6] == '000000':
            return count
        count += 1


print(stocking_stuffer('yzbqklnj'))

