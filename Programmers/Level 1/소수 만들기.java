class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(isPrimeNum(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }

        return answer;
    }
    
    // 소수인지 판별하는 함수
    boolean isPrimeNum(int num) {
        
        for(int i = 2; i < num / 2; i++) {
            if(num % i == 0)
                return false;
        }
        
        return true;
    }
}