class Solution {
    public boolean solution(int x) {
    boolean answer;
    int num = x;
    int sum = 0;
    
    // 자릿수별로 더하기
    while(num / 10 != 0) {
        sum += num % 10;
        num /= 10;
    }
    sum += num; // 마지막 남은 한 자리 더하기
    
    // x의 자릿수의 합으로 x가 나누어지면 true, 아니면 false
    answer = x % sum == 0 ? true : false;

    return answer;
    }   
}