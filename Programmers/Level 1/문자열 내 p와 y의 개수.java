class Solution {

    boolean solution(String s) {
        int pCnt = 0; // p 개수
        int yCnt = 0; // y 개수s

        int idx = 0;
        while(idx < s.length()) {
            if(s.charAt(idx) == 'p' || s.charAt(idx) == 'P')
                pCnt++;
            else if(s.charAt(idx) == 'y' || s.charAt(idx) == 'Y')
                yCnt++;

            idx++;
        }
        
        return pCnt == yCnt ? true : false;
    }

}