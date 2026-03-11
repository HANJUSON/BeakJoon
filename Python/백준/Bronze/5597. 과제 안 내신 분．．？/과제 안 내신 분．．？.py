import sys

students = [index+1 for index in range(30)]
for _ in range(28):
    student_number = int(sys.stdin.readline().strip())
    students.remove(student_number)

print(min(students))
print(max(students))