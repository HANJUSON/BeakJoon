import sys

N = int(sys.stdin.readline().strip())
scores = list(map(int, sys.stdin.readline().strip().split()))
new_scores = [score/max(scores)*100 for score in scores]
average = sum(new_scores) / N
print(average)