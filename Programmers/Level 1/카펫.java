class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        if(yellow == 1)
            return (new int[] {3, 3});
        
        int num = brown - 4;
        for(int i = 1; i <= yellow / 2; i++) {
            if(yellow % i == 0 && ((i + (yellow / i)) * 2) == num) {
                answer[0] = (yellow / i) + 2;
                answer[1] = i + 2;
                break;
            }
        }
    
        return answer;
    }
}