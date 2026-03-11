for i in range(100):
    try:
        sentense = input()
        print(sentense)
    except EOFError:
        continue