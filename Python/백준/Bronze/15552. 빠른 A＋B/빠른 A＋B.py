import sys

testcase = int(input())
for _ in range(testcase):
    a, b = map(int, sys.stdin.readline().split())
    print(a + b)
    