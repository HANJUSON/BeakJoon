score = 0

grade_multiply_gradepoint=0
sum_of_gradepoint = 0
for _ in range(20):
    name, gradepoint, grade = input().split()
    
    if grade == 'A+':
        grade = 4.5
    elif grade == 'A0':
        grade = 4.0
    elif grade == 'B+':
        grade = 3.5
    elif grade == 'B0':
        grade = 3.0
    elif grade == 'C+':
        grade = 2.5
    elif grade == 'C0':
        grade = 2.0
    elif grade == 'D+':
        grade = 1.5
    elif grade == 'D0':
        grade = 1.0
    elif grade == 'F':
        grade = 0
    elif grade == 'P':
        grade = 0
        gradepoint = 0

    grade_multiply_gradepoint += float(grade) * float(gradepoint)
    sum_of_gradepoint += float(gradepoint)

print(grade_multiply_gradepoint/sum_of_gradepoint)
    

