n = input()
a = ''
new = ''
sum = 0

if int(n)<10: n='0'+n
temp = n

while(a!=n):
    new = str(int(temp[0])+int(temp[1]))
    a=temp[1] + new[len(new)-1]
    temp = a
    sum+=1

print(sum)