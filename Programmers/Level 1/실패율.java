import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap<>();
        
        // HashMap에 Key값으로 stage, Value값으로 해당 stage에 도전 중인 사용자 수 저장하기
        for(int i = 0; i < stages.length; i++) {
            if(stages[i] == N + 1) continue;
            if(map.containsKey(stages[i]))
                map.put(stages[i], map.get(stages[i]) + 1);
            else
                map.put(stages[i], 1.0);
        }
        
        // Value값으로 실패율 저장하기
        int num = stages.length;
        double fail = 0;
        for(int i = 1; i <= N; i++) {
            if(map.get(i) == null) {
                map.put(i, 0.0);
                continue;
            }
            fail = map.get(i) / num;
            num -= map.get(i);
            map.replace(i, fail);
        }
        
        // HashMap을 value순으로 정렬해 정답 배열에 key값 넣기
        for(int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()){
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }
        
        return answer;
    }
}