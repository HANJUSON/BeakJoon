import sys

N, M = map(int, sys.stdin.readline().split())
A = [index for index in range(1, N + 1)]
for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    A[i - 1 : j] = reversed(A[i - 1 : j])

print(" ".join(map(str, A)))
