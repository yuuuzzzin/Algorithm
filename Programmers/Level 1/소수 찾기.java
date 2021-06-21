class Solution {

    public int solution(int n) {
        int answer = 0;
        // 에라토스테네스의 체로 거르기 위한 배열
        boolean[] flag = new boolean[n + 1];

        // 2부터 n까지의 수들을 지나며
        int i = 1;
        while(1 < ++i && i < n) {

            // 이미 걸러진 수(소수의 배수)는 PASS
            if(flag[i])
                continue;
            
            // 소수의 배수를 체크
            for(int j = i + i; j <= n; j += i)
                flag[j] = true;

        }

        // 걸러지지 않은 수의 개수 구하기
        for(int idx = 2; idx <= n; idx++) {
             if(!flag[idx])
                 answer++;
        }

        return answer;
    }

}