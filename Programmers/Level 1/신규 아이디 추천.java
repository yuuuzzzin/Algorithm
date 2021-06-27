import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        
        // 1단계
        String id = new_id.toLowerCase();
        
        // 2단계
        char c;
        for(int i = 0; i < id.length(); i++){
            c = id.charAt(i);
            if (('a'<= c && c<='z') || ('0'<=c && c<='9') || c=='-' || c=='_' || c=='.') {
                list.add(c);
            }
        }
            
        // 3단계
        int cnt = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == '.') {
                cnt++;
                if(cnt > 1) {
                    list.remove(i);
                    i--;
                }
            }
            else {
                if(cnt != 0)
                    cnt = 0;
            }     
        }
        
        // 4단계
        if(list.get(0) == '.') list.remove(0);
        if(!list.isEmpty()) {
            if(list.get(list.size() - 1) == '.')
                list.remove(list.size() - 1);
        }
        
        // 5단계
        else
            list.add('a');

        // 6단계
        if(list.size() >= 16) {
            while(list.size() >= 16) {
                list.remove(list.size() - 1);
            }
            if(list.get(list.size() - 1) == '.') list.remove(list.size() - 1);
        }
        
        // 7단계
        if(list.size() <= 2) {
            while(list.size() < 3) {
                list.add(list.get(list.size() - 1));
            }
        }
        
        for(char ch : list)
            answer += ch;
                
        return answer;
    }
}