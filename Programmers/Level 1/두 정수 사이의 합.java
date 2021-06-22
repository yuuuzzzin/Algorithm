class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        
        while(x <= y) {
            answer += x;
            x++;
        }
  
        return answer;
    }
      
  }