import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1])
                al.add(arr[i]);
        }
        
        answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}