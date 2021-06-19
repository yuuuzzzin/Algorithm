class Solution {

    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = num.charAt(answer.length - i - 1) - '0';
        }

        return answer;
    }
}