N = int(input())
count = 1
result = 1
while count < N:
    count += 6 * result
    result += 1

print(result)