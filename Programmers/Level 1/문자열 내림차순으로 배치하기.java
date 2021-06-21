//import java.util.Arrays;

class Solution {

    // swap 함수
    void swap(char[] data, int a, int b) {
        char tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    // 내림차순 정렬(퀵소트) 함수
    void quickSort(char[] data, int l, int r) {
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

    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        quickSort(arr, 0, arr.length - 1);

        return new String(arr);
    }

}