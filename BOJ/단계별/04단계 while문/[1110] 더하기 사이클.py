n = int(input())
count = 0
temp = n
new = None

while(n!=new):
    a = temp%10
    b = temp//10 + a
    new = 10*a + b%10
    temp = new
    count += 1

print(count)