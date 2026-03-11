N = int(input())
for i in range(1, N+1):
    print(' ' * ((2*(N-i))//2) + '*' * (2*i-1))

for i in range(N-1, 0, -1):
    print(' ' * ((2*(N-i))//2) + '*' * (2*i-1))