class Solution {

    public String solution(int n) {
        String answer = "";
        String s = "수박";

        for(int i = 0; i < n; i++) {
            answer += s.charAt(i % 2);
        }

        return answer;
    }

}