import sys

num1 = []
num2 = []
while True:
    a, b= map(int, sys.stdin.readline().split())
    if a == 0 and b == 0:
        for i in range(len(num1)):
            print(num1[i] + num2[i])
        break
    num1.append(a)
    num2.append(b)
