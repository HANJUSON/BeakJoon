sentense = input()

time = 0
for alpha in sentense:
    if alpha == 'A' or alpha == 'B' or alpha == 'C':
        time+=3
    elif alpha == 'D' or alpha == 'E' or alpha == 'F':
        time+=4
    elif alpha == 'G' or alpha == 'H' or alpha == 'I':
        time+=5
    elif alpha == 'J' or alpha == 'K' or alpha == 'L':
        time+=6
    elif alpha == 'M' or alpha == 'N' or alpha == 'O':
        time+=7
    elif alpha == 'P' or alpha == 'Q' or alpha == 'R' or alpha == 'S':
        time+=8
    elif alpha == 'T' or alpha == 'U' or alpha == 'V':
        time+=9
    elif alpha == 'W' or alpha == 'X' or alpha == 'Y' or alpha == 'Z':
        time+=10
    
print(time)