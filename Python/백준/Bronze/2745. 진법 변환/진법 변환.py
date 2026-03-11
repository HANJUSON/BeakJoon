N, B = input().split()
B = int(B)
result = 0
digit = 0
for num in reversed(N):
    num = ord(num)
    if 47<num<58:
        num -= 48
    elif 64<num<91:
        num -= 55
    result += num * (B ** digit)
    digit += 1

print(result)

