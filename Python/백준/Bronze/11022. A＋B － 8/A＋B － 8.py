import sys

testcase = int(input())
for i in range(testcase):
    a, b = map(int, sys.stdin.readline().split())
    print(f"Case #{i+1}: {a} + {b} = {a + b}")
    