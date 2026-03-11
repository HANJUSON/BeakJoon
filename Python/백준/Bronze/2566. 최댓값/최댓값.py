
array = []
max_value = -1
max_index = []

for i in range(9):
    array.append(list(map(int, input().split())))
    
for i in range(9):
    current = array[i]
    current_max=max(current)
    if max_value < current_max:
        max_value = current_max
        max_index = [i+1, current.index(current_max)+1]

print(max_value)
print(*max_index)