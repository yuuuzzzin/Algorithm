class Solution {
  public long[] solution(int x, int n) {
    long[] answer = new long[n];
    long a = x;
    long b = n;

    for( long i = 0 ; i < b ; i++ ) {
        answer[(int)i] = a + (a * i);
    }

    return answer;
  }
}