class Solution {

    public int solution(int n) {
        int answer = 0;
        String temp;
        String result = "";
        
        // 3진법으로 표현
        while(n > 0) {
            temp = String.valueOf(n % 3);
            result = temp.concat(result);
            n /= 3;     
        }

        // 앞뒤 반전
        char[] c = new char[result.length()];
        for(int i = 0; i < result.length(); i++)
            c[c.length - i - 1] = result.charAt(i);

        // 10진법으로 표현
        int idx = c.length;
        int num = 1;
        while(idx-- > 0) {
            answer += (c[idx] - '0') * num;
            num *= 3;
        }

        return answer;
    }

}