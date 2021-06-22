import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i : arr) {
            if(i % divisor == 0)
                al.add(i);
        }

        if(al.isEmpty())
            return (new int[] {-1});

        answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}