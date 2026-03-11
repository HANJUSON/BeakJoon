import sys

M = int(sys.stdin.readline().strip())
for _ in range(M):
    word = sys.stdin.readline().strip()
    print(word[0] + word[-1])

