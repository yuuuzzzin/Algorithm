class Solution {

    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()) {
            sqrt++;
            return (long)(sqrt * sqrt);
        } else return -1;
    }
}