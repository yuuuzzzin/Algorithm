class Solution {

    public String solution(String s, int n) {
        String answer = "";
        char c;
        char[] result = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i); 
            if(c == ' ') // 공백의 경우, 그대로 공백
                result[i] = ' ';
            else if('a' <= c && c <= 'z') { // 소문자인 경우
                // 'z'를 넘어가면 'a'부터 다시 시작하도록
                result[i] = (char)(c + n) <= 'z' ? (char)(c + n) : (char)(c + n - 26);
            }
            else if('A' <= c && c <= 'Z') { // 대문자인 경우
                // 'Z'를 넘어가면 'A'부터 다시 시작하도록
                result[i] = (char)(c + n) <= 'Z' ? (char)(c + n) : (char)(c + n - 26);
            } 
        }      

        for(char i : result)
            answer += i;

        return answer;
    }
}