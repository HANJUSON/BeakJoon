T = input()
for _ in range(int(T)):
    R, S = input().split()
    for alphabet in S:
        print(alphabet * int(R), end='')
    print("")
