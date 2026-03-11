import sys

A = []
for _ in range(10):
    A.append(int(sys.stdin.readline().strip())%42)

print(len(set(A)))