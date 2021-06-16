class Solution {
    // 요일
    static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    // 2016년의 1월-12월 일 수
    static int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String solution(int a, int b) {
        String answer;
        int dayNum = 0;

        // 월에 따른 일 수 더하기
        for(int i = 1; i < a; i++) {
            dayNum += month[i - 1];
        }

        // 일 수 더하기
        dayNum += b; 

        // 요일 계산
        answer = day[(dayNum + 4) % 7];
    
        return answer;
    }
}