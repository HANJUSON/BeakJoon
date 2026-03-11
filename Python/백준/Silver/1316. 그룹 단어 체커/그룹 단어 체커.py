n = int(input())
group_word_count = 0

for _ in range(n):
    word = input()
    error = 0
    for index in range(len(word)-1):  # 인덱스 범위 주의 (0부터 길이-2까지)
        if word[index] != word[index+1]:  # 현재 문자와 다음 문자가 다를 때
            new_word = word[index+1:]     # 다음 문자부터 끝까지 새로운 문자열 생성
            if new_word.count(word[index]) > 0:  # 남은 문자열에 현재 문자가 또 있다면?
                error += 1                # 그룹 단어가 아님
                break
    if error == 0:
        group_word_count += 1

print(group_word_count)