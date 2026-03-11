hour, minite = map(int, input().split())
cooking_time = int(input())

minite += cooking_time
if minite >= 60:
    hour += minite // 60
    minite -= (minite // 60) * 60
    if hour >= 24:
        hour -= 24
print(hour, minite)