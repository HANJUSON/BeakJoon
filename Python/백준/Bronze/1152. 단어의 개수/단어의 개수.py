sentense = input()
if sentense[0]==' ' and sentense[-1]==' ':
    print(sentense.count(' ')-1)
elif sentense[0]==' ' or sentense[-1]==' ':
    print(sentense.count(' '))
else:
    print(sentense.count(' ')+1)