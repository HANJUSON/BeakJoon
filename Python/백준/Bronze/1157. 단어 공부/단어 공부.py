word = input().upper()
dict = {}
for alphabet in word:
    if alphabet in dict:
        dict[alphabet] += 1
    else:
        dict[alphabet] = 1


max_value = [alphabet for alphabet in dict.values() if alphabet == max(dict.values())]

if len(max_value) > 1:
    print("?")
else:
    print(list(dict.keys())[list(dict.values()).index(max(dict.values()))])
