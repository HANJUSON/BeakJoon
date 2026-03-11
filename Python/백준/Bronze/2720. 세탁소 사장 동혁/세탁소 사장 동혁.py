T = int(input())
for _ in range(T):
    total = int(input())
    Quarter = total // 25
    total -= Quarter * 25
    Dime = total // 10
    total -= Dime * 10
    Nickel = total // 5
    total -= Nickel * 5
    Penny = total
    print(f"{Quarter} {Dime} {Nickel} {Penny}")
