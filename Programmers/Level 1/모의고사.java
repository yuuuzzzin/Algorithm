class Solution {
    // 수포자 1번, 2번, 3번의 찍는 방식을 담는 배열
    static int[] num1 = {1, 2, 3, 4, 5};
    static int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    // 3명의 점수를 담을 배열
    static int[] score = new int[3];

    public int[] solution(int[] answers) {
        
        // 채점하여 점수 저장
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == num1[i % num1.length]) score[0]++;
            if(answers[i] == num2[i % num2.length]) score[1]++;
            if(answers[i] == num3[i % num3.length]) score[2]++;
        }

        int max = -1; // 가장 높은 점수
        for(int i : score) {
            if(max < i) max = i;
        }

        int maxCnt = 0; // 가장 높은 점수의 개수
        for(int i : score) {
            if(i == max) maxCnt++;
        }

        // 가장 높은 점수의 개수만큼 answer 배열 생성
        int[] answer = new int[maxCnt];
        int index = 0;

        // 가장 높은 점수를 가진 수포자의 번호 넣어주기
        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) {
                answer[index] = i + 1;
                index ++;
            }
        }

        return answer;
    }
}