class Solution {

    public int solution(int num) {
        long n = num;
        int cnt = 0;

        while(n != 1) {
            if(cnt > 500) return -1;
            
            // 짝수인 경우
            if(n % 2 == 0)
                n /= 2;
            // 홀수인 경우
            else
                n = n * 3 + 1;
            
            cnt++;
        }

        return cnt;
    }
}