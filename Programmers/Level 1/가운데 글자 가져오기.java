class Solution {
  
    public String solution(String s) {
        int n = s.length(); // 입력받은 문자열의 길이

        return n % 2 == 0 ? 
        s.substring(n / 2 - 1, n / 2 + 1) : s.substring(n / 2, n / 2 + 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "qwer";
        //int[] arr = {1, 2, 3, 4, 5};
        System.out.println(s.solution(str));
    }
}