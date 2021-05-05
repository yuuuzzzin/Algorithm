a = int(input())
count = 1
basic = a

while True:
    b = a//10
    c = a%10
    result = b + c
    a = c*10 + result%10
    
    if a == basic:
        break
    else:
        count += 1
print(count)
