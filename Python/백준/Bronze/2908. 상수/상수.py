num1, num2 = map(int, input().split())
num1 = int(str(num1)[::-1])
num2 = int(str(num2)[::-1])
if num1 > num2:
    print(num1)
else:
    print(num2)