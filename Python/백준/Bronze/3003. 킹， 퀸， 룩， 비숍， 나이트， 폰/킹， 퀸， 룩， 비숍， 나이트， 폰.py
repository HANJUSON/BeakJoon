chess_correct = [1,1,2,2,2,8]
chess_incorrect = list(map(int, input().split()))
result = [correct - incorrect for correct, incorrect in zip(chess_correct, chess_incorrect)]
print(*result)