class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int[right - left + 1];
        
        for(int i = left; i <= right; i++) {
            if(i != 1)
                arr[i - left] = 2;
            else
                arr[i - left] = 1;;
            
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0)
                    arr[i - left]++;
            }
            
            if(arr[i - left] % 2 == 0)
                answer += i;
            else 
                answer -= i;
        }        
        
        return answer;
    }
}