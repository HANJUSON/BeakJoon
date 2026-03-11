import sys

howmany= int(input())
a = []
a = list(map(int, sys.stdin.readline().split()))
searchnum = int(input())
print(a.count(searchnum))