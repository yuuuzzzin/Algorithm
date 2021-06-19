class Solution {

    // swap 함수
    void swap(int[] data, int a, int b) {
        int tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    // 내림차순 정렬(퀵소트) 함수
    void quickSort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {
            while(data[left] > pivot)
                left++;
            while(data[right] < pivot)
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

    public long solution(long n) {
        String num = Long.toString(n);
        long answer = 0;
        int[] arr = new int[num.length()];
        String result = "";

        for(int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }

        quickSort(arr, 0, arr.length - 1);

        for(int i : arr) result += i;
        answer = Long.valueOf(result);

        return answer;
    }
}