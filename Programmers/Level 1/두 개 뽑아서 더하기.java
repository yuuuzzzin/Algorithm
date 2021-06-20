import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                // 중복 제거
                if(!arr.contains(numbers[i] + numbers[j]))
                arr.add(numbers[i] + numbers[j]);
            }
        }

        // 정렬
        Collections.sort(arr);

        // 정답 배열에 넣어주기
        int[] answer = new int[arr.size()];
        int idx = 0;
        for (int i : arr) {
            answer[idx++] = i;
        }

        return answer;
    }
}