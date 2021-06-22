import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int num = nums.length / 2; // N/2마리
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i : nums)
            hs.add(i);
        
        return num <= hs.size() ? num : hs.size();
    }
}