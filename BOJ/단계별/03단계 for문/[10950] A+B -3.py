t = int(input())
l = []
for i in range(0, t):
    a, b = map(int, input().split())
    l.append(a+b)
for i in range(len(l)):
    print(l[i])