import sys

N, X = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
result = [str(a) for a in A if a < X]
print(" ".join(result))