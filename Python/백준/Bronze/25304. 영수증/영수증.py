total_price1 = int(input())
type = int(input())
total_price2 = 0
for i in range(type):
    price, count = map(int, input().split())
    total_price2 += price*count
if total_price1 == total_price2:
    print("Yes")
else:
    print("No")