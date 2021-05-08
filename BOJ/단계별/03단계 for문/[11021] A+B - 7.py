def solution(n, k, cmd):
    arr = []
    tmp = [] # 삭제된 행 배열
    for x in range(0, n): # 표 생성
        arr.append('O')

    for index, x in enumerate(cmd):
        if(x.find('U') == 0):
            k -= arr[k-2:k+1].count('X')
            k -= int(x[2])
        elif(x.find('D') == 0):
            k += arr[k:k+3].count('X')
            k += int(x[2])
        elif(x.find('C') == 0):
            arr[k] = 'X'
            tmp.append(k) # 최근에 삭제된 행 번호
            #del arr[k]
            if(k == len(arr) - 1): k = int(len(arr) - 1)
        elif(x.find('Z') == 0):
            arr[tmp.pop()] = 'O'
            #arr.append('O')
            
    # for x in tmp:
    #     arr.insert(x, 'x')
            
    print(''.join(arr))
    return ''.join(arr)