class Solution {

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        int idx = 0;
        int cnt = 0;
        while(idx < arr.length) {
            if(arr[idx].equals(" ")) {
                answer += arr[idx];
                cnt = 0;
            }
            else if(cnt % 2 == 0) {
                cnt++;
                answer += arr[idx].toUpperCase();
            }
            else {
                cnt++;
                answer += arr[idx].toLowerCase();
            }
            idx++;
        }
        
        return answer;
    }
    
}