import sys

testcase = int(input())
for i in range(testcase):
    for j in range(i+1):
        print("*", end="")
    print()