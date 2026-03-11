import sys

testcase = int(input())
for i in range(testcase):
    for _ in range(testcase-i-1):
        sys.stdout.write(' ')
    for _ in range(i+1):
        sys.stdout.write('*')
    sys.stdout.write('\n')