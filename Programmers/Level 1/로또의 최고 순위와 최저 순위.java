import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        HashSet<Integer> hs = new HashSet<>();
        for(int num : win_nums)
            hs.add(num);

        Arrays.sort(lottos);
        
        int winCnt = 0;
        int zeroCnt = 0;
        for(int i = lottos.length - 1; i >= 0; i--) {
            if(lottos[i] == 0) {
                zeroCnt++;
            }
            else if(hs.contains(lottos[i])) {
                hs.remove(lottos[i]);
                winCnt++;     
            }
                
        }
        
        if(winCnt == 6)
            return (new int[] {1, 1});
        else {
            answer[0] = calLotto(Math.min(winCnt + zeroCnt, 6));
            answer[1] = calLotto(winCnt);
        }

        return answer;
    }
    
    int calLotto(int winNum) {
        
        switch(winNum) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}