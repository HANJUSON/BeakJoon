import sys

N, M = map(int, sys.stdin.readline().split())
results = [index+1 for index in range(N)]

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    results[i-1], results[j-1] = results[j-1], results[i-1]
    
print(' '.join(map(str, results)))
