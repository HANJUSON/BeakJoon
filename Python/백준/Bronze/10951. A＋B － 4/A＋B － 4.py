import sys

while True:
    try:
        a, b= map(int, sys.stdin.readline().split())
        
    except EOFError:
        break

    except ValueError:
        break

    print(a + b)
