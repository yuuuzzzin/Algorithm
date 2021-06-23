import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] bonus = {'S', 'D', 'T'};
        char[] option = {'*', '#'};
        char[] arr = dartResult.toCharArray();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int i = 0;
        int score;
        int cnt = 0;
        while(i < arr.length) {
            score = 0;
            if('0' <= arr[i] && arr[i] <= '9') {
                score = arr[i] - '0';
                if(arr[i] == '1' && arr[i + 1] == '0') {
                    score = 10;
                    i++;
                }
                i++;
                if(arr[i] == bonus[1])
                    score = (int)Math.pow(score, 2);
                else if(arr[i] == bonus[2])
                    score = (int)Math.pow(score, 3);
                al.add(score);
                cnt++;
            }
            else if(arr[i] == option[0]) {
                score = al.get(cnt - 1);
                al.set(cnt - 1, score * 2);
                if((cnt - 1) != 0) {
                    score = al.get(cnt - 2);
                    al.set(cnt - 2, score * 2);
                }
            }
            else if(arr[i] == option[1]) {
                score = al.get(cnt - 1);
                al.set(cnt - 1, score * (-1));
            }
            i++;
        }
                       
        for(int j = 0; j < al.size(); j++) {
            answer += al.get(j);
        }
    
        return answer;
    }
}