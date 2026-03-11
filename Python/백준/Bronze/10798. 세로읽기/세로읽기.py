array = []

for _ in range(5):
    array.append(list(map(str, input())))
    


for i in range(15):
    for j in range(5):
        try:
            print(array[j][i], end='')
        except IndexError:
            continue
