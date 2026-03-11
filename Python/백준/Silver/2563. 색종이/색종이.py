count = int(input())
square = []
for _ in range(count):
    x, y = map(int, input().split())
    for xi in range(x, x+10):
        for yi in range(y, y+10):
            if [xi, yi] not in square:
                square.append([xi,yi])
print(len(square))


