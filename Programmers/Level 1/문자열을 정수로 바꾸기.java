class Solution {

    public int solution(String s) {
        int answer = 0;
        boolean value = true;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-')
                value = false;
            else if(s.charAt(i) != '+')
                answer = answer * 10 + (s.charAt(i) - '0');
        }

        return value? answer : -1 * answer;
    }

}