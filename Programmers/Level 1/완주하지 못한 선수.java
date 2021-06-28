import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hs = new HashMap<>();
        
        for(String s : participant) {
            if(!hs.containsKey(s))
                hs.put(s, 1);
            else
                hs.put(s, hs.get(s) + 1);
        }
        
        for(String s : completion) {
            if(hs.containsKey(s)) 
                hs.put(s, hs.get(s) - 1);
        }
        
        for(String key : hs.keySet()) {
            if(hs.get(key) != 0) {
                answer = key;
                break;
            }
        }
            
        return answer;
    }
}