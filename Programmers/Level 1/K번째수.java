class Solution {

    // swap 함수
    void swap(int[] data, int a, int b) {
        int tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    // 오름차순 정렬(퀵소트) 함수
    void quickSort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];
        int tmp;

        do {
            while(data[left] < pivot)
                left++;
            while(data[right] > pivot)
                right--;
            if(left <= right) {
                swap(data, left, right);
                left++;
                right--;
            }
        } while (left <= right);

        if(l < right)
            quickSort(data, l, right);
        if(r > left)
            quickSort(data, left, r);
    }
  
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp;
        int i, j, k;
        int answerIndex = 0;

        for(int[] command : commands) {
            i = command[0];
            j = command[1];
            k = command[2];

            temp = new int[j - i + 1];

            // i번째 숫자부터 j번째 숫자까지 temp 배열에 저장
            int tempIndex = 0;
            for(int n = i - 1; n < j; n++) {
                temp[tempIndex] = array[n];
                tempIndex++;
            }

            // 배열 오름차순 퀵정렬
            quickSort(temp, 0, temp.length - 1);

            // k번째수 answer 배열에 담기
            answer[answerIndex] = temp[k - 1];

            // answer 배열의 인덱스 ++
            answerIndex++;
        }
        
        return answer;
    }
}