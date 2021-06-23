class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) 
            arr[i] = arr1[i] | arr2[i];
        
        String[] answer = new String[n];
 
        for(int i = 0; i < n; i++) {
            String result = "";
            for(int j = 0; j < n; j++) {
                if(arr[i] % 2 == 1)
                    result = "#" + result;
                else
                    result = " " + result;
                arr[i] /= 2;
            }
            
            answer[i] = result;
        }
        
        return answer;
    }
}