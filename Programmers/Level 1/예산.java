import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
    
        double sum = 0;
        int idx = -1;
        while(idx++ < d.length - 1) {
            sum += d[idx];
            answer++;
            
            if(budget < sum) {
                answer--;
                break;
            }
                
        }
        
        return answer;
    }
}