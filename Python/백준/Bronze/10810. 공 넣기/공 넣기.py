import sys

N, M = map(int, sys.stdin.readline().split())
results = [0 for _ in range(N)]

for _ in range(M):
    i, j, k = map(int, sys.stdin.readline().split())
    for index in range(i-1, j):
        results[index] = k
    
print(' '.join(map(str, results)))
