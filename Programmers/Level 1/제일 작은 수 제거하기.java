class Solution {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        // arr 길이가 1인 경우
        if(arr.length == 1) { 
            int[] answer2 = new int[1];
            answer2[0] = -1;
            return answer2;
        }

        // arr의 최소값 구하기
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        
        // answer 배열에 최소값을 제외한 수를 넣어주기
        int idx = 0;
        for(int i : arr) {
            if(i != min) {
                answer[idx++] = i;
            }
        }

        return answer;
    }
}